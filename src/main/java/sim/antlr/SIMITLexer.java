// Generated from C:/Users/vyach/projects/sim-it/src/main/java/sim/antlr\SIMIT.g4 by ANTLR 4.7.2
package sim.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SIMITLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, PLUS=22, MINUS=23, NUMBER=24, 
		BOOL=25, OP=26, CP=27, IF=28, IDENTIFIER=29, WS=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "PLUS", "MINUS", "NUMBER", "INT", 
			"EXP", "BOOL", "OP", "CP", "IF", "IDENTIFIER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'rules:'", "'init_environment:'", "'iterations'", "'='", "';'", 
			"'init_population:'", "'size='", "'*'", "'/'", "'^'", "'=='", "'<'", 
			"'>'", "'<='", "'>='", "'!'", "'&&'", "'||'", "'{'", "'}'", "'avg('", 
			"'+'", "'-'", null, null, "'('", "')'", "'if'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "PLUS", "MINUS", 
			"NUMBER", "BOOL", "OP", "CP", "IF", "IDENTIFIER", "WS"
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


	public SIMITLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SIMIT.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u00e4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3"+
		"\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\6\31\u00ae\n\31\r\31\16\31"+
		"\u00af\5\31\u00b2\n\31\3\31\5\31\u00b5\n\31\3\32\3\32\3\32\7\32\u00ba"+
		"\n\32\f\32\16\32\u00bd\13\32\5\32\u00bf\n\32\3\33\3\33\5\33\u00c3\n\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00d0\n\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \6 \u00da\n \r \16 \u00db\3!\6!"+
		"\u00df\n!\r!\16!\u00e0\3!\3!\2\2\"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\2\65\2\67\339\34;\35=\36?\37A \3\2\b\3\2\62;\3\2\63;\4\2"+
		"GGgg\4\2--//\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u00ea\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3C"+
		"\3\2\2\2\5J\3\2\2\2\7\\\3\2\2\2\tg\3\2\2\2\13i\3\2\2\2\rk\3\2\2\2\17|"+
		"\3\2\2\2\21\u0082\3\2\2\2\23\u0084\3\2\2\2\25\u0086\3\2\2\2\27\u0088\3"+
		"\2\2\2\31\u008b\3\2\2\2\33\u008d\3\2\2\2\35\u008f\3\2\2\2\37\u0092\3\2"+
		"\2\2!\u0095\3\2\2\2#\u0097\3\2\2\2%\u009a\3\2\2\2\'\u009d\3\2\2\2)\u009f"+
		"\3\2\2\2+\u00a1\3\2\2\2-\u00a6\3\2\2\2/\u00a8\3\2\2\2\61\u00aa\3\2\2\2"+
		"\63\u00be\3\2\2\2\65\u00c0\3\2\2\2\67\u00cf\3\2\2\29\u00d1\3\2\2\2;\u00d3"+
		"\3\2\2\2=\u00d5\3\2\2\2?\u00d9\3\2\2\2A\u00de\3\2\2\2CD\7t\2\2DE\7w\2"+
		"\2EF\7n\2\2FG\7g\2\2GH\7u\2\2HI\7<\2\2I\4\3\2\2\2JK\7k\2\2KL\7p\2\2LM"+
		"\7k\2\2MN\7v\2\2NO\7a\2\2OP\7g\2\2PQ\7p\2\2QR\7x\2\2RS\7k\2\2ST\7t\2\2"+
		"TU\7q\2\2UV\7p\2\2VW\7o\2\2WX\7g\2\2XY\7p\2\2YZ\7v\2\2Z[\7<\2\2[\6\3\2"+
		"\2\2\\]\7k\2\2]^\7v\2\2^_\7g\2\2_`\7t\2\2`a\7c\2\2ab\7v\2\2bc\7k\2\2c"+
		"d\7q\2\2de\7p\2\2ef\7u\2\2f\b\3\2\2\2gh\7?\2\2h\n\3\2\2\2ij\7=\2\2j\f"+
		"\3\2\2\2kl\7k\2\2lm\7p\2\2mn\7k\2\2no\7v\2\2op\7a\2\2pq\7r\2\2qr\7q\2"+
		"\2rs\7r\2\2st\7w\2\2tu\7n\2\2uv\7c\2\2vw\7v\2\2wx\7k\2\2xy\7q\2\2yz\7"+
		"p\2\2z{\7<\2\2{\16\3\2\2\2|}\7u\2\2}~\7k\2\2~\177\7|\2\2\177\u0080\7g"+
		"\2\2\u0080\u0081\7?\2\2\u0081\20\3\2\2\2\u0082\u0083\7,\2\2\u0083\22\3"+
		"\2\2\2\u0084\u0085\7\61\2\2\u0085\24\3\2\2\2\u0086\u0087\7`\2\2\u0087"+
		"\26\3\2\2\2\u0088\u0089\7?\2\2\u0089\u008a\7?\2\2\u008a\30\3\2\2\2\u008b"+
		"\u008c\7>\2\2\u008c\32\3\2\2\2\u008d\u008e\7@\2\2\u008e\34\3\2\2\2\u008f"+
		"\u0090\7>\2\2\u0090\u0091\7?\2\2\u0091\36\3\2\2\2\u0092\u0093\7@\2\2\u0093"+
		"\u0094\7?\2\2\u0094 \3\2\2\2\u0095\u0096\7#\2\2\u0096\"\3\2\2\2\u0097"+
		"\u0098\7(\2\2\u0098\u0099\7(\2\2\u0099$\3\2\2\2\u009a\u009b\7~\2\2\u009b"+
		"\u009c\7~\2\2\u009c&\3\2\2\2\u009d\u009e\7}\2\2\u009e(\3\2\2\2\u009f\u00a0"+
		"\7\177\2\2\u00a0*\3\2\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7x\2\2\u00a3"+
		"\u00a4\7i\2\2\u00a4\u00a5\7*\2\2\u00a5,\3\2\2\2\u00a6\u00a7\7-\2\2\u00a7"+
		".\3\2\2\2\u00a8\u00a9\7/\2\2\u00a9\60\3\2\2\2\u00aa\u00b1\5\63\32\2\u00ab"+
		"\u00ad\7\60\2\2\u00ac\u00ae\t\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00af\3"+
		"\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1"+
		"\u00ab\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b5\5\65"+
		"\33\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\62\3\2\2\2\u00b6\u00bf"+
		"\7\62\2\2\u00b7\u00bb\t\3\2\2\u00b8\u00ba\t\2\2\2\u00b9\u00b8\3\2\2\2"+
		"\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bf"+
		"\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00b6\3\2\2\2\u00be\u00b7\3\2\2\2\u00bf"+
		"\64\3\2\2\2\u00c0\u00c2\t\4\2\2\u00c1\u00c3\t\5\2\2\u00c2\u00c1\3\2\2"+
		"\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\5\63\32\2\u00c5"+
		"\66\3\2\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9\7w\2\2\u00c9"+
		"\u00d0\7g\2\2\u00ca\u00cb\7h\2\2\u00cb\u00cc\7c\2\2\u00cc\u00cd\7n\2\2"+
		"\u00cd\u00ce\7u\2\2\u00ce\u00d0\7g\2\2\u00cf\u00c6\3\2\2\2\u00cf\u00ca"+
		"\3\2\2\2\u00d08\3\2\2\2\u00d1\u00d2\7*\2\2\u00d2:\3\2\2\2\u00d3\u00d4"+
		"\7+\2\2\u00d4<\3\2\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7\7h\2\2\u00d7>\3"+
		"\2\2\2\u00d8\u00da\t\6\2\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc@\3\2\2\2\u00dd\u00df\t\7\2\2"+
		"\u00de\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1"+
		"\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\b!\2\2\u00e3B\3\2\2\2\f\2\u00af"+
		"\u00b1\u00b4\u00bb\u00be\u00c2\u00cf\u00db\u00e0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}