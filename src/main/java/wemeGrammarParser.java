// Generated from ../wemeGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class wemeGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STRING=1, NUMBER=2, TRUE=3, FALSE=4, NULL=5, AND=6, OR=7, NOT=8, IF=9, 
		ELSE=10, FOR=11, WHILE=12, FUNCTION=13, CLASS=14, PRINT=15, RETURN=16, 
		SUPER=17, THIS=18, VAR=19, COLON=20, SEMICOLON=21, COMMA=22, DOT=23, MINUS=24, 
		PLUS=25, DIV=26, MUL=27, EQUAL=28, DOUBLE_EQUAL=29, NOT_EQUAL=30, GREATER=31, 
		GREATER_EQUAL=32, LESS=33, LESS_EQUAL=34, LBRACKET=35, RBRACKET=36, LBRACE=37, 
		RBRACE=38, INHERIT=39, WS=40, IDENT=41;
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_varDeclaration = 2, RULE_funDeclaration = 3, 
		RULE_classDeclaration = 4, RULE_function = 5, RULE_parameters = 6, RULE_statement = 7, 
		RULE_ifSt = 8, RULE_ifElseSt = 9, RULE_whileSt = 10, RULE_forSt = 11, 
		RULE_printSt = 12, RULE_returnSt = 13, RULE_block = 14, RULE_expression = 15, 
		RULE_assignment = 16, RULE_call = 17, RULE_primary = 18, RULE_group = 19, 
		RULE_arguments = 20, RULE_orOperation = 21, RULE_andOperation = 22, RULE_eqOperation = 23, 
		RULE_compOperation = 24, RULE_sumOperation = 25, RULE_mulOperation = 26, 
		RULE_unary = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaration", "varDeclaration", "funDeclaration", "classDeclaration", 
			"function", "parameters", "statement", "ifSt", "ifElseSt", "whileSt", 
			"forSt", "printSt", "returnSt", "block", "expression", "assignment", 
			"call", "primary", "group", "arguments", "orOperation", "andOperation", 
			"eqOperation", "compOperation", "sumOperation", "mulOperation", "unary"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'true'", "'false'", "'null'", "'and'", "'or'", "'!'", 
			"'if'", "'else'", "'for'", "'while'", "'fun'", "'class'", "'print'", 
			"'return'", "'super'", "'this'", "'var'", "':'", "';'", "','", "'.'", 
			"'-'", "'+'", "'/'", "'*'", "'='", "'=='", "'!='", "'>'", "'>='", "'<'", 
			"'<='", "'('", "')'", "'{'", "'}'", "'inherit'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STRING", "NUMBER", "TRUE", "FALSE", "NULL", "AND", "OR", "NOT", 
			"IF", "ELSE", "FOR", "WHILE", "FUNCTION", "CLASS", "PRINT", "RETURN", 
			"SUPER", "THIS", "VAR", "COLON", "SEMICOLON", "COMMA", "DOT", "MINUS", 
			"PLUS", "DIV", "MUL", "EQUAL", "DOUBLE_EQUAL", "NOT_EQUAL", "GREATER", 
			"GREATER_EQUAL", "LESS", "LESS_EQUAL", "LBRACKET", "RBRACKET", "LBRACE", 
			"RBRACE", "INHERIT", "WS", "IDENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "wemeGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public wemeGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(wemeGrammarParser.EOF, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << NUMBER) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << NOT) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << FUNCTION) | (1L << CLASS) | (1L << PRINT) | (1L << RETURN) | (1L << SUPER) | (1L << THIS) | (1L << VAR) | (1L << MINUS) | (1L << LBRACKET) | (1L << LBRACE) | (1L << IDENT))) != 0)) {
				{
				{
				setState(56);
				declaration();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public FunDeclarationContext funDeclaration() {
			return getRuleContext(FunDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case NUMBER:
			case TRUE:
			case FALSE:
			case NULL:
			case NOT:
			case IF:
			case FOR:
			case WHILE:
			case PRINT:
			case RETURN:
			case SUPER:
			case THIS:
			case MINUS:
			case LBRACKET:
			case LBRACE:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				statement();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				varDeclaration();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				funDeclaration();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				classDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclarationContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(wemeGrammarParser.VAR, 0); }
		public TerminalNode IDENT() { return getToken(wemeGrammarParser.IDENT, 0); }
		public TerminalNode SEMICOLON() { return getToken(wemeGrammarParser.SEMICOLON, 0); }
		public TerminalNode EQUAL() { return getToken(wemeGrammarParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).exitVarDeclaration(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(VAR);
			setState(71);
			match(IDENT);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(72);
				match(EQUAL);
				setState(73);
				expression();
				}
			}

			setState(76);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunDeclarationContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(wemeGrammarParser.FUNCTION, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).enterFunDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).exitFunDeclaration(this);
		}
	}

	public final FunDeclarationContext funDeclaration() throws RecognitionException {
		FunDeclarationContext _localctx = new FunDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(FUNCTION);
			setState(79);
			function();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(wemeGrammarParser.CLASS, 0); }
		public List<TerminalNode> IDENT() { return getTokens(wemeGrammarParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(wemeGrammarParser.IDENT, i);
		}
		public TerminalNode LBRACE() { return getToken(wemeGrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(wemeGrammarParser.RBRACE, 0); }
		public TerminalNode INHERIT() { return getToken(wemeGrammarParser.INHERIT, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(CLASS);
			setState(82);
			match(IDENT);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERIT) {
				{
				setState(83);
				match(INHERIT);
				setState(84);
				match(IDENT);
				}
			}

			setState(87);
			match(LBRACE);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(88);
				function();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(wemeGrammarParser.IDENT, 0); }
		public TerminalNode LBRACKET() { return getToken(wemeGrammarParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(wemeGrammarParser.RBRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function);
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(IDENT);
				setState(97);
				match(LBRACKET);
				setState(98);
				match(RBRACKET);
				setState(99);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(IDENT);
				setState(101);
				match(LBRACKET);
				setState(102);
				parameters();
				setState(103);
				match(RBRACKET);
				setState(104);
				block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(wemeGrammarParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(wemeGrammarParser.IDENT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(wemeGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(wemeGrammarParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(IDENT);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(109);
				match(COMMA);
				setState(110);
				match(IDENT);
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(wemeGrammarParser.SEMICOLON, 0); }
		public IfStContext ifSt() {
			return getRuleContext(IfStContext.class,0);
		}
		public IfElseStContext ifElseSt() {
			return getRuleContext(IfElseStContext.class,0);
		}
		public WhileStContext whileSt() {
			return getRuleContext(WhileStContext.class,0);
		}
		public ForStContext forSt() {
			return getRuleContext(ForStContext.class,0);
		}
		public PrintStContext printSt() {
			return getRuleContext(PrintStContext.class,0);
		}
		public ReturnStContext returnSt() {
			return getRuleContext(ReturnStContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				expression();
				setState(117);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				ifSt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				ifElseSt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				whileSt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(122);
				forSt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(123);
				printSt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(124);
				returnSt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(125);
				block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(wemeGrammarParser.IF, 0); }
		public TerminalNode LBRACKET() { return getToken(wemeGrammarParser.LBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(wemeGrammarParser.RBRACKET, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).enterIfSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).exitIfSt(this);
		}
	}

	public final IfStContext ifSt() throws RecognitionException {
		IfStContext _localctx = new IfStContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifSt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(IF);
			setState(129);
			match(LBRACKET);
			setState(130);
			expression();
			setState(131);
			match(RBRACKET);
			setState(132);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfElseStContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(wemeGrammarParser.IF, 0); }
		public TerminalNode LBRACKET() { return getToken(wemeGrammarParser.LBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(wemeGrammarParser.RBRACKET, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(wemeGrammarParser.ELSE, 0); }
		public IfElseStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElseSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).enterIfElseSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).exitIfElseSt(this);
		}
	}

	public final IfElseStContext ifElseSt() throws RecognitionException {
		IfElseStContext _localctx = new IfElseStContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifElseSt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(IF);
			setState(135);
			match(LBRACKET);
			setState(136);
			expression();
			setState(137);
			match(RBRACKET);
			setState(138);
			statement();
			setState(139);
			match(ELSE);
			setState(140);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(wemeGrammarParser.WHILE, 0); }
		public TerminalNode LBRACKET() { return getToken(wemeGrammarParser.LBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(wemeGrammarParser.RBRACKET, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).enterWhileSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).exitWhileSt(this);
		}
	}

	public final WhileStContext whileSt() throws RecognitionException {
		WhileStContext _localctx = new WhileStContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_whileSt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(WHILE);
			setState(143);
			match(LBRACKET);
			setState(144);
			expression();
			setState(145);
			match(RBRACKET);
			setState(146);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(wemeGrammarParser.FOR, 0); }
		public TerminalNode LBRACKET() { return getToken(wemeGrammarParser.LBRACKET, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(wemeGrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(wemeGrammarParser.SEMICOLON, i);
		}
		public TerminalNode RBRACKET() { return getToken(wemeGrammarParser.RBRACKET, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ForStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).enterForSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).exitForSt(this);
		}
	}

	public final ForStContext forSt() throws RecognitionException {
		ForStContext _localctx = new ForStContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_forSt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(FOR);
			setState(149);
			match(LBRACKET);
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				setState(150);
				varDeclaration();
				}
				break;
			case STRING:
			case NUMBER:
			case TRUE:
			case FALSE:
			case NULL:
			case NOT:
			case SUPER:
			case THIS:
			case MINUS:
			case LBRACKET:
			case IDENT:
				{
				setState(151);
				expression();
				setState(152);
				match(SEMICOLON);
				}
				break;
			case SEMICOLON:
				{
				setState(154);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << NUMBER) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << NOT) | (1L << SUPER) | (1L << THIS) | (1L << MINUS) | (1L << LBRACKET) | (1L << IDENT))) != 0)) {
				{
				setState(157);
				expression();
				}
			}

			setState(160);
			match(SEMICOLON);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << NUMBER) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << NOT) | (1L << SUPER) | (1L << THIS) | (1L << MINUS) | (1L << LBRACKET) | (1L << IDENT))) != 0)) {
				{
				setState(161);
				expression();
				}
			}

			setState(164);
			match(RBRACKET);
			setState(165);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintStContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(wemeGrammarParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(wemeGrammarParser.SEMICOLON, 0); }
		public PrintStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).enterPrintSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).exitPrintSt(this);
		}
	}

	public final PrintStContext printSt() throws RecognitionException {
		PrintStContext _localctx = new PrintStContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_printSt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(PRINT);
			setState(168);
			expression();
			setState(169);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(wemeGrammarParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(wemeGrammarParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).enterReturnSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).exitReturnSt(this);
		}
	}

	public final ReturnStContext returnSt() throws RecognitionException {
		ReturnStContext _localctx = new ReturnStContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_returnSt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(RETURN);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << NUMBER) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << NOT) | (1L << SUPER) | (1L << THIS) | (1L << MINUS) | (1L << LBRACKET) | (1L << IDENT))) != 0)) {
				{
				setState(172);
				expression();
				}
			}

			setState(175);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(wemeGrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(wemeGrammarParser.RBRACE, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(LBRACE);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << NUMBER) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << NOT) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << FUNCTION) | (1L << CLASS) | (1L << PRINT) | (1L << RETURN) | (1L << SUPER) | (1L << THIS) | (1L << VAR) | (1L << MINUS) | (1L << LBRACKET) | (1L << LBRACE) | (1L << IDENT))) != 0)) {
				{
				{
				setState(178);
				declaration();
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			assignment();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(wemeGrammarParser.IDENT, 0); }
		public TerminalNode EQUAL() { return getToken(wemeGrammarParser.EQUAL, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public TerminalNode DOT() { return getToken(wemeGrammarParser.DOT, 0); }
		public OrOperationContext orOperation() {
			return getRuleContext(OrOperationContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignment);
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(188);
					call();
					setState(189);
					match(DOT);
					}
					break;
				}
				setState(193);
				match(IDENT);
				setState(194);
				match(EQUAL);
				setState(195);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				orOperation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<GroupContext> group() {
			return getRuleContexts(GroupContext.class);
		}
		public GroupContext group(int i) {
			return getRuleContext(GroupContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(wemeGrammarParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(wemeGrammarParser.DOT, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(wemeGrammarParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(wemeGrammarParser.IDENT, i);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).exitCall(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_call);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			primary();
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(203);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LBRACKET:
						{
						setState(200);
						group();
						}
						break;
					case DOT:
						{
						setState(201);
						match(DOT);
						setState(202);
						match(IDENT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(wemeGrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(wemeGrammarParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(wemeGrammarParser.NULL, 0); }
		public TerminalNode THIS() { return getToken(wemeGrammarParser.THIS, 0); }
		public TerminalNode NUMBER() { return getToken(wemeGrammarParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(wemeGrammarParser.STRING, 0); }
		public TerminalNode IDENT() { return getToken(wemeGrammarParser.IDENT, 0); }
		public TerminalNode LBRACKET() { return getToken(wemeGrammarParser.LBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(wemeGrammarParser.RBRACKET, 0); }
		public TerminalNode SUPER() { return getToken(wemeGrammarParser.SUPER, 0); }
		public TerminalNode DOT() { return getToken(wemeGrammarParser.DOT, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_primary);
		try {
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(FALSE);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
				match(NULL);
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 4);
				{
				setState(211);
				match(THIS);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 5);
				{
				setState(212);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 6);
				{
				setState(213);
				match(STRING);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(214);
				match(IDENT);
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 8);
				{
				setState(215);
				match(LBRACKET);
				setState(216);
				expression();
				setState(217);
				match(RBRACKET);
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 9);
				{
				setState(219);
				match(SUPER);
				setState(220);
				match(DOT);
				setState(221);
				match(IDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(wemeGrammarParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(wemeGrammarParser.RBRACKET, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public GroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).enterGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).exitGroup(this);
		}
	}

	public final GroupContext group() throws RecognitionException {
		GroupContext _localctx = new GroupContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_group);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(LBRACKET);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << NUMBER) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << NOT) | (1L << SUPER) | (1L << THIS) | (1L << MINUS) | (1L << LBRACKET) | (1L << IDENT))) != 0)) {
				{
				setState(225);
				arguments();
				}
			}

			setState(228);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(wemeGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(wemeGrammarParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			expression();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(231);
				match(COMMA);
				setState(232);
				expression();
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrOperationContext extends ParserRuleContext {
		public List<AndOperationContext> andOperation() {
			return getRuleContexts(AndOperationContext.class);
		}
		public AndOperationContext andOperation(int i) {
			return getRuleContext(AndOperationContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(wemeGrammarParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(wemeGrammarParser.OR, i);
		}
		public OrOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).enterOrOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).exitOrOperation(this);
		}
	}

	public final OrOperationContext orOperation() throws RecognitionException {
		OrOperationContext _localctx = new OrOperationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_orOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			andOperation();
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(239);
				match(OR);
				setState(240);
				andOperation();
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndOperationContext extends ParserRuleContext {
		public List<EqOperationContext> eqOperation() {
			return getRuleContexts(EqOperationContext.class);
		}
		public EqOperationContext eqOperation(int i) {
			return getRuleContext(EqOperationContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(wemeGrammarParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(wemeGrammarParser.AND, i);
		}
		public AndOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).enterAndOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).exitAndOperation(this);
		}
	}

	public final AndOperationContext andOperation() throws RecognitionException {
		AndOperationContext _localctx = new AndOperationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_andOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			eqOperation();
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(247);
				match(AND);
				setState(248);
				eqOperation();
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqOperationContext extends ParserRuleContext {
		public List<CompOperationContext> compOperation() {
			return getRuleContexts(CompOperationContext.class);
		}
		public CompOperationContext compOperation(int i) {
			return getRuleContext(CompOperationContext.class,i);
		}
		public List<TerminalNode> DOUBLE_EQUAL() { return getTokens(wemeGrammarParser.DOUBLE_EQUAL); }
		public TerminalNode DOUBLE_EQUAL(int i) {
			return getToken(wemeGrammarParser.DOUBLE_EQUAL, i);
		}
		public List<TerminalNode> NOT_EQUAL() { return getTokens(wemeGrammarParser.NOT_EQUAL); }
		public TerminalNode NOT_EQUAL(int i) {
			return getToken(wemeGrammarParser.NOT_EQUAL, i);
		}
		public EqOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).enterEqOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).exitEqOperation(this);
		}
	}

	public final EqOperationContext eqOperation() throws RecognitionException {
		EqOperationContext _localctx = new EqOperationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_eqOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			compOperation();
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOUBLE_EQUAL || _la==NOT_EQUAL) {
				{
				{
				setState(255);
				_la = _input.LA(1);
				if ( !(_la==DOUBLE_EQUAL || _la==NOT_EQUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(256);
				compOperation();
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompOperationContext extends ParserRuleContext {
		public List<SumOperationContext> sumOperation() {
			return getRuleContexts(SumOperationContext.class);
		}
		public SumOperationContext sumOperation(int i) {
			return getRuleContext(SumOperationContext.class,i);
		}
		public List<TerminalNode> LESS() { return getTokens(wemeGrammarParser.LESS); }
		public TerminalNode LESS(int i) {
			return getToken(wemeGrammarParser.LESS, i);
		}
		public List<TerminalNode> LESS_EQUAL() { return getTokens(wemeGrammarParser.LESS_EQUAL); }
		public TerminalNode LESS_EQUAL(int i) {
			return getToken(wemeGrammarParser.LESS_EQUAL, i);
		}
		public List<TerminalNode> GREATER() { return getTokens(wemeGrammarParser.GREATER); }
		public TerminalNode GREATER(int i) {
			return getToken(wemeGrammarParser.GREATER, i);
		}
		public List<TerminalNode> GREATER_EQUAL() { return getTokens(wemeGrammarParser.GREATER_EQUAL); }
		public TerminalNode GREATER_EQUAL(int i) {
			return getToken(wemeGrammarParser.GREATER_EQUAL, i);
		}
		public CompOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).enterCompOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).exitCompOperation(this);
		}
	}

	public final CompOperationContext compOperation() throws RecognitionException {
		CompOperationContext _localctx = new CompOperationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_compOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			sumOperation();
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER) | (1L << GREATER_EQUAL) | (1L << LESS) | (1L << LESS_EQUAL))) != 0)) {
				{
				{
				setState(263);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER) | (1L << GREATER_EQUAL) | (1L << LESS) | (1L << LESS_EQUAL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(264);
				sumOperation();
				}
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SumOperationContext extends ParserRuleContext {
		public List<MulOperationContext> mulOperation() {
			return getRuleContexts(MulOperationContext.class);
		}
		public MulOperationContext mulOperation(int i) {
			return getRuleContext(MulOperationContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(wemeGrammarParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(wemeGrammarParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(wemeGrammarParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(wemeGrammarParser.MINUS, i);
		}
		public SumOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).enterSumOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).exitSumOperation(this);
		}
	}

	public final SumOperationContext sumOperation() throws RecognitionException {
		SumOperationContext _localctx = new SumOperationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_sumOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			mulOperation();
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINUS || _la==PLUS) {
				{
				{
				setState(271);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==PLUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(272);
				mulOperation();
				}
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MulOperationContext extends ParserRuleContext {
		public List<UnaryContext> unary() {
			return getRuleContexts(UnaryContext.class);
		}
		public UnaryContext unary(int i) {
			return getRuleContext(UnaryContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(wemeGrammarParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(wemeGrammarParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(wemeGrammarParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(wemeGrammarParser.DIV, i);
		}
		public MulOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).enterMulOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).exitMulOperation(this);
		}
	}

	public final MulOperationContext mulOperation() throws RecognitionException {
		MulOperationContext _localctx = new MulOperationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_mulOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			unary();
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DIV || _la==MUL) {
				{
				{
				setState(279);
				_la = _input.LA(1);
				if ( !(_la==DIV || _la==MUL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(280);
				unary();
				}
				}
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryContext extends ParserRuleContext {
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(wemeGrammarParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(wemeGrammarParser.MINUS, 0); }
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wemeGrammarListener ) ((wemeGrammarListener)listener).exitUnary(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_unary);
		int _la;
		try {
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				_la = _input.LA(1);
				if ( !(_la==NOT || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(287);
				unary();
				}
				break;
			case STRING:
			case NUMBER:
			case TRUE:
			case FALSE:
			case NULL:
			case SUPER:
			case THIS:
			case LBRACKET:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				call();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u0126\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\7\2<\n\2\f\2\16\2?\13\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\5\3G\n\3\3\4\3\4\3\4\3\4\5\4M\n\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\5\6X\n\6\3\6\3\6\7\6\\\n\6\f\6\16\6_\13\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7m\n\7\3\b\3\b\3\b\7\br\n"+
		"\b\f\b\16\bu\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0081\n"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u009e\n\r\3\r\5\r"+
		"\u00a1\n\r\3\r\3\r\5\r\u00a5\n\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\5\17\u00b0\n\17\3\17\3\17\3\20\3\20\7\20\u00b6\n\20\f\20\16\20\u00b9"+
		"\13\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\5\22\u00c2\n\22\3\22\3\22\3"+
		"\22\3\22\5\22\u00c8\n\22\3\23\3\23\3\23\3\23\7\23\u00ce\n\23\f\23\16\23"+
		"\u00d1\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\5\24\u00e1\n\24\3\25\3\25\5\25\u00e5\n\25\3\25\3\25\3\26"+
		"\3\26\3\26\7\26\u00ec\n\26\f\26\16\26\u00ef\13\26\3\27\3\27\3\27\7\27"+
		"\u00f4\n\27\f\27\16\27\u00f7\13\27\3\30\3\30\3\30\7\30\u00fc\n\30\f\30"+
		"\16\30\u00ff\13\30\3\31\3\31\3\31\7\31\u0104\n\31\f\31\16\31\u0107\13"+
		"\31\3\32\3\32\3\32\7\32\u010c\n\32\f\32\16\32\u010f\13\32\3\33\3\33\3"+
		"\33\7\33\u0114\n\33\f\33\16\33\u0117\13\33\3\34\3\34\3\34\7\34\u011c\n"+
		"\34\f\34\16\34\u011f\13\34\3\35\3\35\3\35\5\35\u0124\n\35\3\35\2\2\36"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\7\3\2"+
		"\37 \3\2!$\3\2\32\33\3\2\34\35\4\2\n\n\32\32\2\u0134\2=\3\2\2\2\4F\3\2"+
		"\2\2\6H\3\2\2\2\bP\3\2\2\2\nS\3\2\2\2\fl\3\2\2\2\16n\3\2\2\2\20\u0080"+
		"\3\2\2\2\22\u0082\3\2\2\2\24\u0088\3\2\2\2\26\u0090\3\2\2\2\30\u0096\3"+
		"\2\2\2\32\u00a9\3\2\2\2\34\u00ad\3\2\2\2\36\u00b3\3\2\2\2 \u00bc\3\2\2"+
		"\2\"\u00c7\3\2\2\2$\u00c9\3\2\2\2&\u00e0\3\2\2\2(\u00e2\3\2\2\2*\u00e8"+
		"\3\2\2\2,\u00f0\3\2\2\2.\u00f8\3\2\2\2\60\u0100\3\2\2\2\62\u0108\3\2\2"+
		"\2\64\u0110\3\2\2\2\66\u0118\3\2\2\28\u0123\3\2\2\2:<\5\4\3\2;:\3\2\2"+
		"\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\7\2\2\3A\3\3\2"+
		"\2\2BG\5\20\t\2CG\5\6\4\2DG\5\b\5\2EG\5\n\6\2FB\3\2\2\2FC\3\2\2\2FD\3"+
		"\2\2\2FE\3\2\2\2G\5\3\2\2\2HI\7\25\2\2IL\7+\2\2JK\7\36\2\2KM\5 \21\2L"+
		"J\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\7\27\2\2O\7\3\2\2\2PQ\7\17\2\2QR\5\f\7"+
		"\2R\t\3\2\2\2ST\7\20\2\2TW\7+\2\2UV\7)\2\2VX\7+\2\2WU\3\2\2\2WX\3\2\2"+
		"\2XY\3\2\2\2Y]\7\'\2\2Z\\\5\f\7\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2"+
		"\2\2^`\3\2\2\2_]\3\2\2\2`a\7(\2\2a\13\3\2\2\2bc\7+\2\2cd\7%\2\2de\7&\2"+
		"\2em\5\36\20\2fg\7+\2\2gh\7%\2\2hi\5\16\b\2ij\7&\2\2jk\5\36\20\2km\3\2"+
		"\2\2lb\3\2\2\2lf\3\2\2\2m\r\3\2\2\2ns\7+\2\2op\7\30\2\2pr\7+\2\2qo\3\2"+
		"\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\17\3\2\2\2us\3\2\2\2vw\5 \21\2wx\7"+
		"\27\2\2x\u0081\3\2\2\2y\u0081\5\22\n\2z\u0081\5\24\13\2{\u0081\5\26\f"+
		"\2|\u0081\5\30\r\2}\u0081\5\32\16\2~\u0081\5\34\17\2\177\u0081\5\36\20"+
		"\2\u0080v\3\2\2\2\u0080y\3\2\2\2\u0080z\3\2\2\2\u0080{\3\2\2\2\u0080|"+
		"\3\2\2\2\u0080}\3\2\2\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081\21\3\2"+
		"\2\2\u0082\u0083\7\13\2\2\u0083\u0084\7%\2\2\u0084\u0085\5 \21\2\u0085"+
		"\u0086\7&\2\2\u0086\u0087\5\20\t\2\u0087\23\3\2\2\2\u0088\u0089\7\13\2"+
		"\2\u0089\u008a\7%\2\2\u008a\u008b\5 \21\2\u008b\u008c\7&\2\2\u008c\u008d"+
		"\5\20\t\2\u008d\u008e\7\f\2\2\u008e\u008f\5\20\t\2\u008f\25\3\2\2\2\u0090"+
		"\u0091\7\16\2\2\u0091\u0092\7%\2\2\u0092\u0093\5 \21\2\u0093\u0094\7&"+
		"\2\2\u0094\u0095\5\20\t\2\u0095\27\3\2\2\2\u0096\u0097\7\r\2\2\u0097\u009d"+
		"\7%\2\2\u0098\u009e\5\6\4\2\u0099\u009a\5 \21\2\u009a\u009b\7\27\2\2\u009b"+
		"\u009e\3\2\2\2\u009c\u009e\7\27\2\2\u009d\u0098\3\2\2\2\u009d\u0099\3"+
		"\2\2\2\u009d\u009c\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u00a1\5 \21\2\u00a0"+
		"\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\7\27"+
		"\2\2\u00a3\u00a5\5 \21\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a7\7&\2\2\u00a7\u00a8\5\20\t\2\u00a8\31\3\2\2"+
		"\2\u00a9\u00aa\7\21\2\2\u00aa\u00ab\5 \21\2\u00ab\u00ac\7\27\2\2\u00ac"+
		"\33\3\2\2\2\u00ad\u00af\7\22\2\2\u00ae\u00b0\5 \21\2\u00af\u00ae\3\2\2"+
		"\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\7\27\2\2\u00b2"+
		"\35\3\2\2\2\u00b3\u00b7\7\'\2\2\u00b4\u00b6\5\4\3\2\u00b5\u00b4\3\2\2"+
		"\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba"+
		"\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\7(\2\2\u00bb\37\3\2\2\2\u00bc"+
		"\u00bd\5\"\22\2\u00bd!\3\2\2\2\u00be\u00bf\5$\23\2\u00bf\u00c0\7\31\2"+
		"\2\u00c0\u00c2\3\2\2\2\u00c1\u00be\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3"+
		"\3\2\2\2\u00c3\u00c4\7+\2\2\u00c4\u00c5\7\36\2\2\u00c5\u00c8\5\"\22\2"+
		"\u00c6\u00c8\5,\27\2\u00c7\u00c1\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8#\3"+
		"\2\2\2\u00c9\u00cf\5&\24\2\u00ca\u00ce\5(\25\2\u00cb\u00cc\7\31\2\2\u00cc"+
		"\u00ce\7+\2\2\u00cd\u00ca\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d1\3\2"+
		"\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0%\3\2\2\2\u00d1\u00cf"+
		"\3\2\2\2\u00d2\u00e1\7\5\2\2\u00d3\u00e1\7\6\2\2\u00d4\u00e1\7\7\2\2\u00d5"+
		"\u00e1\7\24\2\2\u00d6\u00e1\7\4\2\2\u00d7\u00e1\7\3\2\2\u00d8\u00e1\7"+
		"+\2\2\u00d9\u00da\7%\2\2\u00da\u00db\5 \21\2\u00db\u00dc\7&\2\2\u00dc"+
		"\u00e1\3\2\2\2\u00dd\u00de\7\23\2\2\u00de\u00df\7\31\2\2\u00df\u00e1\7"+
		"+\2\2\u00e0\u00d2\3\2\2\2\u00e0\u00d3\3\2\2\2\u00e0\u00d4\3\2\2\2\u00e0"+
		"\u00d5\3\2\2\2\u00e0\u00d6\3\2\2\2\u00e0\u00d7\3\2\2\2\u00e0\u00d8\3\2"+
		"\2\2\u00e0\u00d9\3\2\2\2\u00e0\u00dd\3\2\2\2\u00e1\'\3\2\2\2\u00e2\u00e4"+
		"\7%\2\2\u00e3\u00e5\5*\26\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00e7\7&\2\2\u00e7)\3\2\2\2\u00e8\u00ed\5 \21\2\u00e9"+
		"\u00ea\7\30\2\2\u00ea\u00ec\5 \21\2\u00eb\u00e9\3\2\2\2\u00ec\u00ef\3"+
		"\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee+\3\2\2\2\u00ef\u00ed"+
		"\3\2\2\2\u00f0\u00f5\5.\30\2\u00f1\u00f2\7\t\2\2\u00f2\u00f4\5.\30\2\u00f3"+
		"\u00f1\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2"+
		"\2\2\u00f6-\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00fd\5\60\31\2\u00f9\u00fa"+
		"\7\b\2\2\u00fa\u00fc\5\60\31\2\u00fb\u00f9\3\2\2\2\u00fc\u00ff\3\2\2\2"+
		"\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe/\3\2\2\2\u00ff\u00fd\3"+
		"\2\2\2\u0100\u0105\5\62\32\2\u0101\u0102\t\2\2\2\u0102\u0104\5\62\32\2"+
		"\u0103\u0101\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106"+
		"\3\2\2\2\u0106\61\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u010d\5\64\33\2\u0109"+
		"\u010a\t\3\2\2\u010a\u010c\5\64\33\2\u010b\u0109\3\2\2\2\u010c\u010f\3"+
		"\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\63\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u0110\u0115\5\66\34\2\u0111\u0112\t\4\2\2\u0112\u0114\5"+
		"\66\34\2\u0113\u0111\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\65\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u011d\58\35"+
		"\2\u0119\u011a\t\5\2\2\u011a\u011c\58\35\2\u011b\u0119\3\2\2\2\u011c\u011f"+
		"\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\67\3\2\2\2\u011f"+
		"\u011d\3\2\2\2\u0120\u0121\t\6\2\2\u0121\u0124\58\35\2\u0122\u0124\5$"+
		"\23\2\u0123\u0120\3\2\2\2\u0123\u0122\3\2\2\2\u01249\3\2\2\2\35=FLW]l"+
		"s\u0080\u009d\u00a0\u00a4\u00af\u00b7\u00c1\u00c7\u00cd\u00cf\u00e0\u00e4"+
		"\u00ed\u00f5\u00fd\u0105\u010d\u0115\u011d\u0123";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}