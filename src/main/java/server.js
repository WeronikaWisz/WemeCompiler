// Require the framework and instantiate it
const fastify = require("fastify")({ logger: true });
const path = require("path");
const fs = require("fs");
const { exec } = require("child_process");

fastify.register(require("fastify-static"), {
  root: path.join(__dirname, "public"),
  prefix: "/weme/",
});

fastify.get("/", async (request, reply) => {
  return reply.sendFile("index.html");
});

fastify.get("/result_js", async (request, reply) => {
  return new Promise(function (resolve) {
    resolve(fs.readFileSync("result.js", "utf-8"));
  });
});

// fastify.get("/errors", async (request, reply) => {
//   return new Promise(function (resolve) {
//     resolve(fs.readFileSync("errors", "utf-8"));
//   });
// });

fastify.post("/interpret", async (request, reply) => {
  return new Promise(function (resolve) {
    fs.writeFileSync("file.txt", request.body);
    exec(
      "javac *.java | java Main.java file.txt result.js &> js_result | node result.js > js_result",
      () => {
        const res1 = fs.readFileSync("result.js", "utf-8");
        const res2 = fs.readFileSync("js_result", "utf-8");
        // const res3 = fs.readFileSync("errors.txt", "utf-8");
        resolve(res2);
      }
    );
  });
});

const start = async () => {
  try {
    await fastify.listen(3000);
  } catch (err) {
    fastify.log.error(err);
    process.exit(1);
  }
};
start();
