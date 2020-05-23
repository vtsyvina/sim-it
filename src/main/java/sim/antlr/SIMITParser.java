// Generated from C:/Users/vyach/projects/sim-it/src/main/java/sim/antlr\SIMIT.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, PLUS=27, MINUS=28, NOT=29, ELSE=30, NUMBER=31, BOOL=32, 
		OB=33, CB=34, OP=35, CP=36, IF=37, IDENTIFIER=38, WS=39;
	public static final int
		RULE_mainblock = 0, RULE_initEnv = 1, RULE_initIterations = 2, RULE_initPop = 3, 
		RULE_initEnvVar = 4, RULE_initPopVar = 5, RULE_popSize = 6, RULE_assignment = 7, 
		RULE_ru = 8, RULE_rules = 9, RULE_number_expression = 10, RULE_operation = 11, 
		RULE_rand_function = 12, RULE_max_function = 13, RULE_min_function = 14, 
		RULE_individual_var = 15, RULE_boolean_expression = 16, RULE_number_comparison = 17, 
		RULE_logical_operation = 18, RULE_if_rule = 19, RULE_aggregate_function = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"mainblock", "initEnv", "initIterations", "initPop", "initEnvVar", "initPopVar", 
			"popSize", "assignment", "ru", "rules", "number_expression", "operation", 
			"rand_function", "max_function", "min_function", "individual_var", "boolean_expression", 
			"number_comparison", "logical_operation", "if_rule", "aggregate_function"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'rules:'", "'init_environment:'", "'iterations'", "'='", "';'", 
			"'init_population:'", "'size='", "'*'", "'/'", "'^'", "'%'", "'rand'", 
			"','", "'max'", "'min'", "'!='", "'=='", "'<'", "'>'", "'>='", "'<='", 
			"'&&'", "'||'", "'{'", "'}'", "'avg'", "'+'", "'-'", "'!'", "'else'", 
			null, null, "'['", "']'", "'('", "')'", "'if'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "PLUS", "MINUS", "NOT", "ELSE", "NUMBER", "BOOL", "OB", 
			"CB", "OP", "CP", "IF", "IDENTIFIER", "WS"
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
		public RulesContext rules() {
			return getRuleContext(RulesContext.class,0);
		}
		public InitPopContext initPop() {
			return getRuleContext(InitPopContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SIMITVisitor ) return ((SIMITVisitor<? extends T>)visitor).visitMainblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainblockContext mainblock() throws RecognitionException {
		MainblockContext _localctx = new MainblockContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mainblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			initEnv();
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(43);
				initPop();
				}
			}

			setState(46);
			match(T__0);
			setState(47);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SIMITVisitor ) return ((SIMITVisitor<? extends T>)visitor).visitInitEnv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitEnvContext initEnv() throws RecognitionException {
		InitEnvContext _localctx = new InitEnvContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_initEnv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(T__1);
			setState(50);
			initIterations();
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(51);
				initEnvVar();
				}
				break;
			}
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(54);
				initEnvVar();
				}
				}
				setState(59);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SIMITVisitor ) return ((SIMITVisitor<? extends T>)visitor).visitInitIterations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitIterationsContext initIterations() throws RecognitionException {
		InitIterationsContext _localctx = new InitIterationsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_initIterations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__2);
			setState(61);
			match(T__3);
			setState(62);
			match(NUMBER);
			setState(63);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SIMITVisitor ) return ((SIMITVisitor<? extends T>)visitor).visitInitPop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitPopContext initPop() throws RecognitionException {
		InitPopContext _localctx = new InitPopContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_initPop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__5);
			setState(66);
			popSize();
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(67);
				initPopVar();
				}
				break;
			}
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(70);
				initPopVar();
				}
				}
				setState(75);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SIMITVisitor ) return ((SIMITVisitor<? extends T>)visitor).visitInitEnvVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitEnvVarContext initEnvVar() throws RecognitionException {
		InitEnvVarContext _localctx = new InitEnvVarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_initEnvVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(IDENTIFIER);
			setState(77);
			match(T__3);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(78);
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

			setState(81);
			match(NUMBER);
			setState(82);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SIMITVisitor ) return ((SIMITVisitor<? extends T>)visitor).visitInitPopVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitPopVarContext initPopVar() throws RecognitionException {
		InitPopVarContext _localctx = new InitPopVarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_initPopVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(IDENTIFIER);
			setState(85);
			match(T__3);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(86);
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

			setState(89);
			match(NUMBER);
			setState(90);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SIMITVisitor ) return ((SIMITVisitor<? extends T>)visitor).visitPopSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PopSizeContext popSize() throws RecognitionException {
		PopSizeContext _localctx = new PopSizeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_popSize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__6);
			setState(93);
			match(NUMBER);
			setState(94);
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
		public Individual_varContext individual_var() {
			return getRuleContext(Individual_varContext.class,0);
		}
		public Number_expressionContext number_expression() {
			return getRuleContext(Number_expressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SIMITParser.IDENTIFIER, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SIMITVisitor ) return ((SIMITVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignment);
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				individual_var();
				setState(97);
				match(T__3);
				setState(98);
				number_expression(0);
				setState(99);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(IDENTIFIER);
				setState(102);
				match(T__3);
				setState(103);
				number_expression(0);
				setState(104);
				match(T__4);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SIMITVisitor ) return ((SIMITVisitor<? extends T>)visitor).visitRu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuContext ru() throws RecognitionException {
		RuContext _localctx = new RuContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ru);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				if_rule();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SIMITVisitor ) return ((SIMITVisitor<? extends T>)visitor).visitRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulesContext rules() throws RecognitionException {
		RulesContext _localctx = new RulesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_rules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			ru();
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IF || _la==IDENTIFIER) {
				{
				{
				setState(113);
				ru();
				}
				}
				setState(118);
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
		public Individual_varContext individual_var() {
			return getRuleContext(Individual_varContext.class,0);
		}
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
		public Rand_functionContext rand_function() {
			return getRuleContext(Rand_functionContext.class,0);
		}
		public Max_functionContext max_function() {
			return getRuleContext(Max_functionContext.class,0);
		}
		public Min_functionContext min_function() {
			return getRuleContext(Min_functionContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SIMITVisitor ) return ((SIMITVisitor<? extends T>)visitor).visitNumber_expression(this);
			else return visitor.visitChildren(this);
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
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(120);
				individual_var();
				}
				break;
			case 2:
				{
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(121);
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

				setState(124);
				match(NUMBER);
				}
				break;
			case 3:
				{
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(125);
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

				setState(128);
				match(IDENTIFIER);
				}
				break;
			case 4:
				{
				setState(129);
				match(OP);
				setState(130);
				number_expression(0);
				setState(131);
				match(CP);
				}
				break;
			case 5:
				{
				setState(133);
				rand_function();
				}
				break;
			case 6:
				{
				setState(134);
				max_function();
				}
				break;
			case 7:
				{
				setState(135);
				min_function();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Number_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_number_expression);
					setState(138);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(139);
					operation();
					setState(140);
					number_expression(8);
					}
					} 
				}
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SIMITVisitor ) return ((SIMITVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << PLUS) | (1L << MINUS))) != 0)) ) {
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

	public static class Rand_functionContext extends ParserRuleContext {
		public TerminalNode OP() { return getToken(SIMITParser.OP, 0); }
		public List<Number_expressionContext> number_expression() {
			return getRuleContexts(Number_expressionContext.class);
		}
		public Number_expressionContext number_expression(int i) {
			return getRuleContext(Number_expressionContext.class,i);
		}
		public TerminalNode CP() { return getToken(SIMITParser.CP, 0); }
		public Rand_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rand_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SIMITListener ) ((SIMITListener)listener).enterRand_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SIMITListener ) ((SIMITListener)listener).exitRand_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SIMITVisitor ) return ((SIMITVisitor<? extends T>)visitor).visitRand_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rand_functionContext rand_function() throws RecognitionException {
		Rand_functionContext _localctx = new Rand_functionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_rand_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__11);
			setState(150);
			match(OP);
			setState(151);
			number_expression(0);
			setState(152);
			match(T__12);
			setState(153);
			number_expression(0);
			setState(154);
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

	public static class Max_functionContext extends ParserRuleContext {
		public TerminalNode OP() { return getToken(SIMITParser.OP, 0); }
		public List<Number_expressionContext> number_expression() {
			return getRuleContexts(Number_expressionContext.class);
		}
		public Number_expressionContext number_expression(int i) {
			return getRuleContext(Number_expressionContext.class,i);
		}
		public TerminalNode CP() { return getToken(SIMITParser.CP, 0); }
		public Max_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_max_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SIMITListener ) ((SIMITListener)listener).enterMax_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SIMITListener ) ((SIMITListener)listener).exitMax_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SIMITVisitor ) return ((SIMITVisitor<? extends T>)visitor).visitMax_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Max_functionContext max_function() throws RecognitionException {
		Max_functionContext _localctx = new Max_functionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_max_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__13);
			setState(157);
			match(OP);
			setState(158);
			number_expression(0);
			setState(159);
			match(T__12);
			setState(160);
			number_expression(0);
			setState(161);
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

	public static class Min_functionContext extends ParserRuleContext {
		public TerminalNode OP() { return getToken(SIMITParser.OP, 0); }
		public List<Number_expressionContext> number_expression() {
			return getRuleContexts(Number_expressionContext.class);
		}
		public Number_expressionContext number_expression(int i) {
			return getRuleContext(Number_expressionContext.class,i);
		}
		public TerminalNode CP() { return getToken(SIMITParser.CP, 0); }
		public Min_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_min_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SIMITListener ) ((SIMITListener)listener).enterMin_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SIMITListener ) ((SIMITListener)listener).exitMin_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SIMITVisitor ) return ((SIMITVisitor<? extends T>)visitor).visitMin_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Min_functionContext min_function() throws RecognitionException {
		Min_functionContext _localctx = new Min_functionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_min_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__14);
			setState(164);
			match(OP);
			setState(165);
			number_expression(0);
			setState(166);
			match(T__12);
			setState(167);
			number_expression(0);
			setState(168);
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

	public static class Individual_varContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SIMITParser.IDENTIFIER, 0); }
		public TerminalNode OB() { return getToken(SIMITParser.OB, 0); }
		public Number_expressionContext number_expression() {
			return getRuleContext(Number_expressionContext.class,0);
		}
		public TerminalNode CB() { return getToken(SIMITParser.CB, 0); }
		public Individual_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_individual_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SIMITListener ) ((SIMITListener)listener).enterIndividual_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SIMITListener ) ((SIMITListener)listener).exitIndividual_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SIMITVisitor ) return ((SIMITVisitor<? extends T>)visitor).visitIndividual_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Individual_varContext individual_var() throws RecognitionException {
		Individual_varContext _localctx = new Individual_varContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_individual_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(IDENTIFIER);
			setState(171);
			match(OB);
			setState(172);
			number_expression(0);
			setState(173);
			match(CB);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SIMITVisitor ) return ((SIMITVisitor<? extends T>)visitor).visitBoolean_expression(this);
			else return visitor.visitChildren(this);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_boolean_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(176);
				match(BOOL);
				}
				break;
			case 2:
				{
				setState(177);
				number_expression(0);
				setState(178);
				number_comparison();
				setState(179);
				number_expression(0);
				}
				break;
			case 3:
				{
				setState(181);
				match(OP);
				setState(182);
				boolean_expression(0);
				setState(183);
				match(CP);
				}
				break;
			case 4:
				{
				setState(185);
				match(NOT);
				setState(186);
				boolean_expression(2);
				}
				break;
			case 5:
				{
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(196);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Boolean_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_boolean_expression);
					setState(190);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(191);
					logical_operation();
					setState(192);
					boolean_expression(4);
					}
					} 
				}
				setState(198);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SIMITVisitor ) return ((SIMITVisitor<? extends T>)visitor).visitNumber_comparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Number_comparisonContext number_comparison() throws RecognitionException {
		Number_comparisonContext _localctx = new Number_comparisonContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_number_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SIMITVisitor ) return ((SIMITVisitor<? extends T>)visitor).visitLogical_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_operationContext logical_operation() throws RecognitionException {
		Logical_operationContext _localctx = new Logical_operationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_logical_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__21) | (1L << T__22))) != 0)) ) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SIMITVisitor ) return ((SIMITVisitor<? extends T>)visitor).visitIf_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_ruleContext if_rule() throws RecognitionException {
		If_ruleContext _localctx = new If_ruleContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_if_rule);
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(IF);
				setState(204);
				boolean_expression(0);
				setState(205);
				match(T__23);
				setState(206);
				rules();
				setState(207);
				match(T__24);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(IF);
				setState(210);
				boolean_expression(0);
				setState(211);
				match(T__23);
				setState(212);
				rules();
				setState(213);
				match(T__24);
				setState(214);
				match(ELSE);
				setState(215);
				match(T__23);
				setState(216);
				rules();
				setState(217);
				match(T__24);
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
		public TerminalNode OP() { return getToken(SIMITParser.OP, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SIMITVisitor ) return ((SIMITVisitor<? extends T>)visitor).visitAggregate_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aggregate_functionContext aggregate_function() throws RecognitionException {
		Aggregate_functionContext _localctx = new Aggregate_functionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_aggregate_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(T__25);
			setState(222);
			match(OP);
			setState(223);
			match(IDENTIFIER);
			setState(224);
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
		case 16:
			return boolean_expression_sempred((Boolean_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean number_expression_sempred(Number_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u00e5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\5\2/\n\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\5\3\67\n\3\3\3\7\3:\n\3\f\3\16\3=\13\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\5\5G\n\5\3\5\7\5J\n\5\f\5\16\5M\13\5\3\6\3\6\3\6\5\6R\n"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\5\7Z\n\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tm\n\t\3\n\3\n\5\nq\n\n\3\13\3\13"+
		"\7\13u\n\13\f\13\16\13x\13\13\3\f\3\f\3\f\5\f}\n\f\3\f\3\f\5\f\u0081\n"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u008b\n\f\3\f\3\f\3\f\3\f\7\f\u0091"+
		"\n\f\f\f\16\f\u0094\13\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\5\22\u00bf\n\22\3\22\3\22\3\22\3\22\7\22\u00c5\n\22"+
		"\f\22\16\22\u00c8\13\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00de\n\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\2\4\26\"\27\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*\2\6\3\2\35\36\4\2\n\r\35\36\3\2\22\27\4\2\22\23\30"+
		"\31\2\u00e8\2,\3\2\2\2\4\63\3\2\2\2\6>\3\2\2\2\bC\3\2\2\2\nN\3\2\2\2\f"+
		"V\3\2\2\2\16^\3\2\2\2\20l\3\2\2\2\22p\3\2\2\2\24r\3\2\2\2\26\u008a\3\2"+
		"\2\2\30\u0095\3\2\2\2\32\u0097\3\2\2\2\34\u009e\3\2\2\2\36\u00a5\3\2\2"+
		"\2 \u00ac\3\2\2\2\"\u00be\3\2\2\2$\u00c9\3\2\2\2&\u00cb\3\2\2\2(\u00dd"+
		"\3\2\2\2*\u00df\3\2\2\2,.\5\4\3\2-/\5\b\5\2.-\3\2\2\2./\3\2\2\2/\60\3"+
		"\2\2\2\60\61\7\3\2\2\61\62\5\24\13\2\62\3\3\2\2\2\63\64\7\4\2\2\64\66"+
		"\5\6\4\2\65\67\5\n\6\2\66\65\3\2\2\2\66\67\3\2\2\2\67;\3\2\2\28:\5\n\6"+
		"\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\5\3\2\2\2=;\3\2\2\2>?\7\5"+
		"\2\2?@\7\6\2\2@A\7!\2\2AB\7\7\2\2B\7\3\2\2\2CD\7\b\2\2DF\5\16\b\2EG\5"+
		"\f\7\2FE\3\2\2\2FG\3\2\2\2GK\3\2\2\2HJ\5\f\7\2IH\3\2\2\2JM\3\2\2\2KI\3"+
		"\2\2\2KL\3\2\2\2L\t\3\2\2\2MK\3\2\2\2NO\7(\2\2OQ\7\6\2\2PR\t\2\2\2QP\3"+
		"\2\2\2QR\3\2\2\2RS\3\2\2\2ST\7!\2\2TU\7\7\2\2U\13\3\2\2\2VW\7(\2\2WY\7"+
		"\6\2\2XZ\t\2\2\2YX\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\7!\2\2\\]\7\7\2\2]\r"+
		"\3\2\2\2^_\7\t\2\2_`\7!\2\2`a\7\7\2\2a\17\3\2\2\2bc\5 \21\2cd\7\6\2\2"+
		"de\5\26\f\2ef\7\7\2\2fm\3\2\2\2gh\7(\2\2hi\7\6\2\2ij\5\26\f\2jk\7\7\2"+
		"\2km\3\2\2\2lb\3\2\2\2lg\3\2\2\2m\21\3\2\2\2nq\5(\25\2oq\5\20\t\2pn\3"+
		"\2\2\2po\3\2\2\2q\23\3\2\2\2rv\5\22\n\2su\5\22\n\2ts\3\2\2\2ux\3\2\2\2"+
		"vt\3\2\2\2vw\3\2\2\2w\25\3\2\2\2xv\3\2\2\2yz\b\f\1\2z\u008b\5 \21\2{}"+
		"\t\2\2\2|{\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\u008b\7!\2\2\177\u0081\t\2\2\2"+
		"\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u008b"+
		"\7(\2\2\u0083\u0084\7%\2\2\u0084\u0085\5\26\f\2\u0085\u0086\7&\2\2\u0086"+
		"\u008b\3\2\2\2\u0087\u008b\5\32\16\2\u0088\u008b\5\34\17\2\u0089\u008b"+
		"\5\36\20\2\u008ay\3\2\2\2\u008a|\3\2\2\2\u008a\u0080\3\2\2\2\u008a\u0083"+
		"\3\2\2\2\u008a\u0087\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b"+
		"\u0092\3\2\2\2\u008c\u008d\f\t\2\2\u008d\u008e\5\30\r\2\u008e\u008f\5"+
		"\26\f\n\u008f\u0091\3\2\2\2\u0090\u008c\3\2\2\2\u0091\u0094\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\27\3\2\2\2\u0094\u0092\3\2\2"+
		"\2\u0095\u0096\t\3\2\2\u0096\31\3\2\2\2\u0097\u0098\7\16\2\2\u0098\u0099"+
		"\7%\2\2\u0099\u009a\5\26\f\2\u009a\u009b\7\17\2\2\u009b\u009c\5\26\f\2"+
		"\u009c\u009d\7&\2\2\u009d\33\3\2\2\2\u009e\u009f\7\20\2\2\u009f\u00a0"+
		"\7%\2\2\u00a0\u00a1\5\26\f\2\u00a1\u00a2\7\17\2\2\u00a2\u00a3\5\26\f\2"+
		"\u00a3\u00a4\7&\2\2\u00a4\35\3\2\2\2\u00a5\u00a6\7\21\2\2\u00a6\u00a7"+
		"\7%\2\2\u00a7\u00a8\5\26\f\2\u00a8\u00a9\7\17\2\2\u00a9\u00aa\5\26\f\2"+
		"\u00aa\u00ab\7&\2\2\u00ab\37\3\2\2\2\u00ac\u00ad\7(\2\2\u00ad\u00ae\7"+
		"#\2\2\u00ae\u00af\5\26\f\2\u00af\u00b0\7$\2\2\u00b0!\3\2\2\2\u00b1\u00b2"+
		"\b\22\1\2\u00b2\u00bf\7\"\2\2\u00b3\u00b4\5\26\f\2\u00b4\u00b5\5$\23\2"+
		"\u00b5\u00b6\5\26\f\2\u00b6\u00bf\3\2\2\2\u00b7\u00b8\7%\2\2\u00b8\u00b9"+
		"\5\"\22\2\u00b9\u00ba\7&\2\2\u00ba\u00bf\3\2\2\2\u00bb\u00bc\7\37\2\2"+
		"\u00bc\u00bf\5\"\22\4\u00bd\u00bf\3\2\2\2\u00be\u00b1\3\2\2\2\u00be\u00b3"+
		"\3\2\2\2\u00be\u00b7\3\2\2\2\u00be\u00bb\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf"+
		"\u00c6\3\2\2\2\u00c0\u00c1\f\5\2\2\u00c1\u00c2\5&\24\2\u00c2\u00c3\5\""+
		"\22\6\u00c3\u00c5\3\2\2\2\u00c4\u00c0\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7#\3\2\2\2\u00c8\u00c6\3\2\2\2"+
		"\u00c9\u00ca\t\4\2\2\u00ca%\3\2\2\2\u00cb\u00cc\t\5\2\2\u00cc\'\3\2\2"+
		"\2\u00cd\u00ce\7\'\2\2\u00ce\u00cf\5\"\22\2\u00cf\u00d0\7\32\2\2\u00d0"+
		"\u00d1\5\24\13\2\u00d1\u00d2\7\33\2\2\u00d2\u00de\3\2\2\2\u00d3\u00d4"+
		"\7\'\2\2\u00d4\u00d5\5\"\22\2\u00d5\u00d6\7\32\2\2\u00d6\u00d7\5\24\13"+
		"\2\u00d7\u00d8\7\33\2\2\u00d8\u00d9\7 \2\2\u00d9\u00da\7\32\2\2\u00da"+
		"\u00db\5\24\13\2\u00db\u00dc\7\33\2\2\u00dc\u00de\3\2\2\2\u00dd\u00cd"+
		"\3\2\2\2\u00dd\u00d3\3\2\2\2\u00de)\3\2\2\2\u00df\u00e0\7\34\2\2\u00e0"+
		"\u00e1\7%\2\2\u00e1\u00e2\7(\2\2\u00e2\u00e3\7&\2\2\u00e3+\3\2\2\2\23"+
		".\66;FKQYlpv|\u0080\u008a\u0092\u00be\u00c6\u00dd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}