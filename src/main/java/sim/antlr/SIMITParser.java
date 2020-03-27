// Generated from C:/Users/vyach/projects/sim-it/src/main/java/sim/antlr\SIMIT.g4 by ANTLR 4.7.2
package sim.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SIMITParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, PLUS=22, MINUS=23, NOT=24, ELSE=25, 
		NUMBER=26, BOOL=27, OP=28, CP=29, IF=30, IDENTIFIER=31, WS=32;
	public static final int
		RULE_mainblock = 0, RULE_initEnv = 1, RULE_initIterations = 2, RULE_initPop = 3, 
		RULE_initEnvVar = 4, RULE_initPopVar = 5, RULE_popSize = 6, RULE_assignment = 7, 
		RULE_ru = 8, RULE_rules = 9, RULE_number_expression = 10, RULE_operation = 11, 
		RULE_boolean_expression = 12, RULE_number_comparison = 13, RULE_logical_operation = 14, 
		RULE_if_rule = 15, RULE_aggregate_function = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"mainblock", "initEnv", "initIterations", "initPop", "initEnvVar", "initPopVar", 
			"popSize", "assignment", "ru", "rules", "number_expression", "operation", 
			"boolean_expression", "number_comparison", "logical_operation", "if_rule", 
			"aggregate_function"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'rules:'", "'init_environment:'", "'iterations'", "'='", "';'", 
			"'init_population:'", "'size='", "'*'", "'/'", "'^'", "'=='", "'<'", 
			"'>'", "'>='", "'<='", "'&&'", "'||'", "'!='", "'{'", "'}'", "'avg('", 
			"'+'", "'-'", "'!'", "'else'", null, null, "'('", "')'", "'if'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "PLUS", "MINUS", 
			"NOT", "ELSE", "NUMBER", "BOOL", "OP", "CP", "IF", "IDENTIFIER", "WS"
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
	public String getGrammarFileName() { return "SIMIT.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SIMITParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MainblockContext extends ParserRuleContext {
		public InitEnvContext initEnv() {
			return getRuleContext(InitEnvContext.class,0);
		}
		public InitPopContext initPop() {
			return getRuleContext(InitPopContext.class,0);
		}
		public RulesContext rules() {
			return getRuleContext(RulesContext.class,0);
		}
		public MainblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SIMITListener ) ((SIMITListener)listener).enterMainblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SIMITListener ) ((SIMITListener)listener).exitMainblock(this);
		}
	}

	public final MainblockContext mainblock() throws RecognitionException {
		MainblockContext _localctx = new MainblockContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mainblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			initEnv();
			setState(35);
			initPop();
			setState(36);
			match(T__0);
			setState(37);
			rules();
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

	public static class InitEnvContext extends ParserRuleContext {
		public InitIterationsContext initIterations() {
			return getRuleContext(InitIterationsContext.class,0);
		}
		public List<InitEnvVarContext> initEnvVar() {
			return getRuleContexts(InitEnvVarContext.class);
		}
		public InitEnvVarContext initEnvVar(int i) {
			return getRuleContext(InitEnvVarContext.class,i);
		}
		public InitEnvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initEnv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SIMITListener ) ((SIMITListener)listener).enterInitEnv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SIMITListener ) ((SIMITListener)listener).exitInitEnv(this);
		}
	}

	public final InitEnvContext initEnv() throws RecognitionException {
		InitEnvContext _localctx = new InitEnvContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_initEnv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(T__1);
			setState(40);
			initIterations();
			setState(41);
			initEnvVar();
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(42);
				initEnvVar();
				}
				}
				setState(47);
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

	public static class InitIterationsContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(SIMITParser.NUMBER, 0); }
		public InitIterationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initIterations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SIMITListener ) ((SIMITListener)listener).enterInitIterations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SIMITListener ) ((SIMITListener)listener).exitInitIterations(this);
		}
	}

	public final InitIterationsContext initIterations() throws RecognitionException {
		InitIterationsContext _localctx = new InitIterationsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_initIterations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__2);
			setState(49);
			match(T__3);
			setState(50);
			match(NUMBER);
			setState(51);
			match(T__4);
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

	public static class InitPopContext extends ParserRuleContext {
		public PopSizeContext popSize() {
			return getRuleContext(PopSizeContext.class,0);
		}
		public List<InitPopVarContext> initPopVar() {
			return getRuleContexts(InitPopVarContext.class);
		}
		public InitPopVarContext initPopVar(int i) {
			return getRuleContext(InitPopVarContext.class,i);
		}
		public InitPopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initPop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SIMITListener ) ((SIMITListener)listener).enterInitPop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SIMITListener ) ((SIMITListener)listener).exitInitPop(this);
		}
	}

	public final InitPopContext initPop() throws RecognitionException {
		InitPopContext _localctx = new InitPopContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_initPop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(T__5);
			setState(54);
			popSize();
			setState(55);
			initPopVar();
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(56);
				initPopVar();
				}
				}
				setState(61);
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

	public static class InitEnvVarContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SIMITParser.IDENTIFIER, 0); }
		public TerminalNode NUMBER() { return getToken(SIMITParser.NUMBER, 0); }
		public TerminalNode PLUS() { return getToken(SIMITParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SIMITParser.MINUS, 0); }
		public InitEnvVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initEnvVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SIMITListener ) ((SIMITListener)listener).enterInitEnvVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SIMITListener ) ((SIMITListener)listener).exitInitEnvVar(this);
		}
	}

	public final InitEnvVarContext initEnvVar() throws RecognitionException {
		InitEnvVarContext _localctx = new InitEnvVarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_initEnvVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(IDENTIFIER);
			setState(63);
			match(T__3);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(64);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(67);
			match(NUMBER);
			setState(68);
			match(T__4);
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

	public static class InitPopVarContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SIMITParser.IDENTIFIER, 0); }
		public TerminalNode NUMBER() { return getToken(SIMITParser.NUMBER, 0); }
		public TerminalNode PLUS() { return getToken(SIMITParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SIMITParser.MINUS, 0); }
		public InitPopVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initPopVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SIMITListener ) ((SIMITListener)listener).enterInitPopVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SIMITListener ) ((SIMITListener)listener).exitInitPopVar(this);
		}
	}

	public final InitPopVarContext initPopVar() throws RecognitionException {
		InitPopVarContext _localctx = new InitPopVarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_initPopVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(IDENTIFIER);
			setState(71);
			match(T__3);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(72);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(75);
			match(NUMBER);
			setState(76);
			match(T__4);
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

	public static class PopSizeContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(SIMITParser.NUMBER, 0); }
		public PopSizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_popSize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SIMITListener ) ((SIMITListener)listener).enterPopSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SIMITListener ) ((SIMITListener)listener).exitPopSize(this);
		}
	}

	public final PopSizeContext popSize() throws RecognitionException {
		PopSizeContext _localctx = new PopSizeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_popSize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__6);
			setState(79);
			match(NUMBER);
			setState(80);
			match(T__4);
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
		public TerminalNode IDENTIFIER() { return getToken(SIMITParser.IDENTIFIER, 0); }
		public Number_expressionContext number_expression() {
			return getRuleContext(Number_expressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SIMITListener ) ((SIMITListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SIMITListener ) ((SIMITListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(IDENTIFIER);
			setState(83);
			match(T__3);
			setState(84);
			number_expression(0);
			setState(85);
			match(T__4);
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

	public static class RuContext extends ParserRuleContext {
		public If_ruleContext if_rule() {
			return getRuleContext(If_ruleContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public RuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ru; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SIMITListener ) ((SIMITListener)listener).enterRu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SIMITListener ) ((SIMITListener)listener).exitRu(this);
		}
	}

	public final RuContext ru() throws RecognitionException {
		RuContext _localctx = new RuContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ru);
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				if_rule();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				assignment();
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

	public static class RulesContext extends ParserRuleContext {
		public List<RuContext> ru() {
			return getRuleContexts(RuContext.class);
		}
		public RuContext ru(int i) {
			return getRuleContext(RuContext.class,i);
		}
		public RulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SIMITListener ) ((SIMITListener)listener).enterRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SIMITListener ) ((SIMITListener)listener).exitRules(this);
		}
	}

	public final RulesContext rules() throws RecognitionException {
		RulesContext _localctx = new RulesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_rules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			ru();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IF || _la==IDENTIFIER) {
				{
				{
				setState(92);
				ru();
				}
				}
				setState(97);
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

	public static class Number_expressionContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(SIMITParser.NUMBER, 0); }
		public TerminalNode PLUS() { return getToken(SIMITParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SIMITParser.MINUS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SIMITParser.IDENTIFIER, 0); }
		public TerminalNode OP() { return getToken(SIMITParser.OP, 0); }
		public List<Number_expressionContext> number_expression() {
			return getRuleContexts(Number_expressionContext.class);
		}
		public Number_expressionContext number_expression(int i) {
			return getRuleContext(Number_expressionContext.class,i);
		}
		public TerminalNode CP() { return getToken(SIMITParser.CP, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public Number_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SIMITListener ) ((SIMITListener)listener).enterNumber_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SIMITListener ) ((SIMITListener)listener).exitNumber_expression(this);
		}
	}

	public final Number_expressionContext number_expression() throws RecognitionException {
		return number_expression(0);
	}

	private Number_expressionContext number_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Number_expressionContext _localctx = new Number_expressionContext(_ctx, _parentState);
		Number_expressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_number_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(99);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(102);
				match(NUMBER);
				}
				break;
			case 2:
				{
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(103);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(106);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				setState(107);
				match(OP);
				setState(108);
				number_expression(0);
				setState(109);
				match(CP);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Number_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_number_expression);
					setState(113);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(114);
					operation();
					setState(115);
					number_expression(5);
					}
					} 
				}
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class OperationContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(SIMITParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SIMITParser.MINUS, 0); }
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SIMITListener ) ((SIMITListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SIMITListener ) ((SIMITListener)listener).exitOperation(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << PLUS) | (1L << MINUS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Boolean_expressionContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(SIMITParser.BOOL, 0); }
		public List<Number_expressionContext> number_expression() {
			return getRuleContexts(Number_expressionContext.class);
		}
		public Number_expressionContext number_expression(int i) {
			return getRuleContext(Number_expressionContext.class,i);
		}
		public Number_comparisonContext number_comparison() {
			return getRuleContext(Number_comparisonContext.class,0);
		}
		public TerminalNode OP() { return getToken(SIMITParser.OP, 0); }
		public List<Boolean_expressionContext> boolean_expression() {
			return getRuleContexts(Boolean_expressionContext.class);
		}
		public Boolean_expressionContext boolean_expression(int i) {
			return getRuleContext(Boolean_expressionContext.class,i);
		}
		public TerminalNode CP() { return getToken(SIMITParser.CP, 0); }
		public TerminalNode NOT() { return getToken(SIMITParser.NOT, 0); }
		public Logical_operationContext logical_operation() {
			return getRuleContext(Logical_operationContext.class,0);
		}
		public Boolean_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SIMITListener ) ((SIMITListener)listener).enterBoolean_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SIMITListener ) ((SIMITListener)listener).exitBoolean_expression(this);
		}
	}

	public final Boolean_expressionContext boolean_expression() throws RecognitionException {
		return boolean_expression(0);
	}

	private Boolean_expressionContext boolean_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Boolean_expressionContext _localctx = new Boolean_expressionContext(_ctx, _parentState);
		Boolean_expressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_boolean_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(125);
				match(BOOL);
				}
				break;
			case 2:
				{
				setState(126);
				number_expression(0);
				setState(127);
				number_comparison();
				setState(128);
				number_expression(0);
				}
				break;
			case 3:
				{
				setState(130);
				match(OP);
				setState(131);
				boolean_expression(0);
				setState(132);
				match(CP);
				}
				break;
			case 4:
				{
				setState(134);
				match(NOT);
				setState(135);
				boolean_expression(2);
				}
				break;
			case 5:
				{
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Boolean_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_boolean_expression);
					setState(139);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(140);
					logical_operation();
					setState(141);
					boolean_expression(4);
					}
					} 
				}
				setState(147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Number_comparisonContext extends ParserRuleContext {
		public Number_comparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SIMITListener ) ((SIMITListener)listener).enterNumber_comparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SIMITListener ) ((SIMITListener)listener).exitNumber_comparison(this);
		}
	}

	public final Number_comparisonContext number_comparison() throws RecognitionException {
		Number_comparisonContext _localctx = new Number_comparisonContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_number_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Logical_operationContext extends ParserRuleContext {
		public Logical_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SIMITListener ) ((SIMITListener)listener).enterLogical_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SIMITListener ) ((SIMITListener)listener).exitLogical_operation(this);
		}
	}

	public final Logical_operationContext logical_operation() throws RecognitionException {
		Logical_operationContext _localctx = new Logical_operationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_logical_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class If_ruleContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SIMITParser.IF, 0); }
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public List<RulesContext> rules() {
			return getRuleContexts(RulesContext.class);
		}
		public RulesContext rules(int i) {
			return getRuleContext(RulesContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SIMITParser.ELSE, 0); }
		public If_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SIMITListener ) ((SIMITListener)listener).enterIf_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SIMITListener ) ((SIMITListener)listener).exitIf_rule(this);
		}
	}

	public final If_ruleContext if_rule() throws RecognitionException {
		If_ruleContext _localctx = new If_ruleContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_if_rule);
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(IF);
				setState(153);
				boolean_expression(0);
				setState(154);
				match(T__18);
				setState(155);
				rules();
				setState(156);
				match(T__19);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				match(IF);
				setState(159);
				boolean_expression(0);
				setState(160);
				match(T__18);
				setState(161);
				rules();
				setState(162);
				match(T__19);
				setState(163);
				match(ELSE);
				setState(164);
				match(T__18);
				setState(165);
				rules();
				setState(166);
				match(T__19);
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

	public static class Aggregate_functionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SIMITParser.IDENTIFIER, 0); }
		public TerminalNode CP() { return getToken(SIMITParser.CP, 0); }
		public Aggregate_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SIMITListener ) ((SIMITListener)listener).enterAggregate_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SIMITListener ) ((SIMITListener)listener).exitAggregate_function(this);
		}
	}

	public final Aggregate_functionContext aggregate_function() throws RecognitionException {
		Aggregate_functionContext _localctx = new Aggregate_functionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_aggregate_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__20);
			setState(171);
			match(IDENTIFIER);
			setState(172);
			match(CP);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return number_expression_sempred((Number_expressionContext)_localctx, predIndex);
		case 12:
			return boolean_expression_sempred((Boolean_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean number_expression_sempred(Number_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean boolean_expression_sempred(Boolean_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00b1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3.\n\3\f\3\16\3\61\13\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5<\n\5\f\5\16\5?\13\5\3\6\3\6\3\6\5\6D"+
		"\n\6\3\6\3\6\3\6\3\7\3\7\3\7\5\7L\n\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\5\n\\\n\n\3\13\3\13\7\13`\n\13\f\13\16\13c\13"+
		"\13\3\f\3\f\5\fg\n\f\3\f\3\f\5\fk\n\f\3\f\3\f\3\f\3\f\3\f\5\fr\n\f\3\f"+
		"\3\f\3\f\3\f\7\fx\n\f\f\f\16\f{\13\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u008c\n\16\3\16\3\16\3\16"+
		"\3\16\7\16\u0092\n\16\f\16\16\16\u0095\13\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u00ab\n\21\3\22\3\22\3\22\3\22\3\22\2\4\26\32\23\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"\2\6\3\2\30\31\4\2\n\f\30\31\3\2\r\21"+
		"\4\2\r\r\22\24\2\u00b0\2$\3\2\2\2\4)\3\2\2\2\6\62\3\2\2\2\b\67\3\2\2\2"+
		"\n@\3\2\2\2\fH\3\2\2\2\16P\3\2\2\2\20T\3\2\2\2\22[\3\2\2\2\24]\3\2\2\2"+
		"\26q\3\2\2\2\30|\3\2\2\2\32\u008b\3\2\2\2\34\u0096\3\2\2\2\36\u0098\3"+
		"\2\2\2 \u00aa\3\2\2\2\"\u00ac\3\2\2\2$%\5\4\3\2%&\5\b\5\2&\'\7\3\2\2\'"+
		"(\5\24\13\2(\3\3\2\2\2)*\7\4\2\2*+\5\6\4\2+/\5\n\6\2,.\5\n\6\2-,\3\2\2"+
		"\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\5\3\2\2\2\61/\3\2\2\2\62\63\7"+
		"\5\2\2\63\64\7\6\2\2\64\65\7\34\2\2\65\66\7\7\2\2\66\7\3\2\2\2\678\7\b"+
		"\2\289\5\16\b\29=\5\f\7\2:<\5\f\7\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3"+
		"\2\2\2>\t\3\2\2\2?=\3\2\2\2@A\7!\2\2AC\7\6\2\2BD\t\2\2\2CB\3\2\2\2CD\3"+
		"\2\2\2DE\3\2\2\2EF\7\34\2\2FG\7\7\2\2G\13\3\2\2\2HI\7!\2\2IK\7\6\2\2J"+
		"L\t\2\2\2KJ\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\7\34\2\2NO\7\7\2\2O\r\3\2\2"+
		"\2PQ\7\t\2\2QR\7\34\2\2RS\7\7\2\2S\17\3\2\2\2TU\7!\2\2UV\7\6\2\2VW\5\26"+
		"\f\2WX\7\7\2\2X\21\3\2\2\2Y\\\5 \21\2Z\\\5\20\t\2[Y\3\2\2\2[Z\3\2\2\2"+
		"\\\23\3\2\2\2]a\5\22\n\2^`\5\22\n\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3"+
		"\2\2\2b\25\3\2\2\2ca\3\2\2\2df\b\f\1\2eg\t\2\2\2fe\3\2\2\2fg\3\2\2\2g"+
		"h\3\2\2\2hr\7\34\2\2ik\t\2\2\2ji\3\2\2\2jk\3\2\2\2kl\3\2\2\2lr\7!\2\2"+
		"mn\7\36\2\2no\5\26\f\2op\7\37\2\2pr\3\2\2\2qd\3\2\2\2qj\3\2\2\2qm\3\2"+
		"\2\2ry\3\2\2\2st\f\6\2\2tu\5\30\r\2uv\5\26\f\7vx\3\2\2\2ws\3\2\2\2x{\3"+
		"\2\2\2yw\3\2\2\2yz\3\2\2\2z\27\3\2\2\2{y\3\2\2\2|}\t\3\2\2}\31\3\2\2\2"+
		"~\177\b\16\1\2\177\u008c\7\35\2\2\u0080\u0081\5\26\f\2\u0081\u0082\5\34"+
		"\17\2\u0082\u0083\5\26\f\2\u0083\u008c\3\2\2\2\u0084\u0085\7\36\2\2\u0085"+
		"\u0086\5\32\16\2\u0086\u0087\7\37\2\2\u0087\u008c\3\2\2\2\u0088\u0089"+
		"\7\32\2\2\u0089\u008c\5\32\16\4\u008a\u008c\3\2\2\2\u008b~\3\2\2\2\u008b"+
		"\u0080\3\2\2\2\u008b\u0084\3\2\2\2\u008b\u0088\3\2\2\2\u008b\u008a\3\2"+
		"\2\2\u008c\u0093\3\2\2\2\u008d\u008e\f\5\2\2\u008e\u008f\5\36\20\2\u008f"+
		"\u0090\5\32\16\6\u0090\u0092\3\2\2\2\u0091\u008d\3\2\2\2\u0092\u0095\3"+
		"\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\33\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0096\u0097\t\4\2\2\u0097\35\3\2\2\2\u0098\u0099\t\5\2"+
		"\2\u0099\37\3\2\2\2\u009a\u009b\7 \2\2\u009b\u009c\5\32\16\2\u009c\u009d"+
		"\7\25\2\2\u009d\u009e\5\24\13\2\u009e\u009f\7\26\2\2\u009f\u00ab\3\2\2"+
		"\2\u00a0\u00a1\7 \2\2\u00a1\u00a2\5\32\16\2\u00a2\u00a3\7\25\2\2\u00a3"+
		"\u00a4\5\24\13\2\u00a4\u00a5\7\26\2\2\u00a5\u00a6\7\33\2\2\u00a6\u00a7"+
		"\7\25\2\2\u00a7\u00a8\5\24\13\2\u00a8\u00a9\7\26\2\2\u00a9\u00ab\3\2\2"+
		"\2\u00aa\u009a\3\2\2\2\u00aa\u00a0\3\2\2\2\u00ab!\3\2\2\2\u00ac\u00ad"+
		"\7\27\2\2\u00ad\u00ae\7!\2\2\u00ae\u00af\7\37\2\2\u00af#\3\2\2\2\17/="+
		"CK[afjqy\u008b\u0093\u00aa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}