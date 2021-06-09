const btn = document.querySelector(".btn");
const btnJS = document.querySelector(".btn-show");
const input = document.querySelector(".input_area");
const compiled = document.querySelector(".compiled_area");
const output = document.querySelector(".output_area");

btn.addEventListener("click", async () => {
  const out = await fetch("/interpret", {
    method: "POST",
    body: JSON.stringify(input.value),
    headers: {
      "Content-Type": "application/json",
    },
  });
  let text_result = await out.text();
  output.innerText = text_result;

  const comp = await fetch("/result_js", {
    method: "GET",
    headers: {
      "Content-Type": "application/json",
    },
  });
  text_result = await comp.text();
  compiled.innerText = text_result;

  // const err = await fetch("/errors", {
  //   method: "GET",
  //   headers: {
  //     "Content-Type": "application/json",
  //   },
  // });
  // text_result = await err.text();
  // errors.innerText = text_result;
});

btnJS.addEventListener("click", () => {
  const divJS = document.querySelector(".compiled");
  if (divJS.style.display == "none") {
    divJS.style.display = "block";
  } else {
    divJS.style.display = "none";
  }
});
