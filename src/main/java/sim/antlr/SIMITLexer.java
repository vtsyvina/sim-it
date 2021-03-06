// Generated from C:/Users/vyach/projects/sim-it/src/main/java/sim/antlr\SIMIT.g4 by ANTLR 4.8
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
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "PLUS", "MINUS", "NOT", "ELSE", "NUMBER", "INT", "EXP", "BOOL", 
			"OB", "CB", "OP", "CP", "IF", "IDENTIFIER", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2)\u0114\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3"+
		"\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 "+
		"\3 \6 \u00d8\n \r \16 \u00d9\5 \u00dc\n \3 \5 \u00df\n \3!\3!\3!\7!\u00e4"+
		"\n!\f!\16!\u00e7\13!\5!\u00e9\n!\3\"\3\"\5\"\u00ed\n\"\3\"\3\"\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\5#\u00fa\n#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3)"+
		"\3)\7)\u0109\n)\f)\16)\u010c\13)\3*\6*\u010f\n*\r*\16*\u0110\3*\3*\2\2"+
		"+\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\2C\2E\"G#I$K%M&O\'Q(S)\3\2\t\3\2\62;\3\2\63;\4\2GGgg\4\2--//\4\2"+
		"C\\c|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u011a\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2"+
		"\2\2Q\3\2\2\2\2S\3\2\2\2\3U\3\2\2\2\5\\\3\2\2\2\7n\3\2\2\2\ty\3\2\2\2"+
		"\13{\3\2\2\2\r}\3\2\2\2\17\u008e\3\2\2\2\21\u0094\3\2\2\2\23\u0096\3\2"+
		"\2\2\25\u0098\3\2\2\2\27\u009a\3\2\2\2\31\u009c\3\2\2\2\33\u00a1\3\2\2"+
		"\2\35\u00a3\3\2\2\2\37\u00a7\3\2\2\2!\u00ab\3\2\2\2#\u00ae\3\2\2\2%\u00b1"+
		"\3\2\2\2\'\u00b3\3\2\2\2)\u00b5\3\2\2\2+\u00b8\3\2\2\2-\u00bb\3\2\2\2"+
		"/\u00be\3\2\2\2\61\u00c1\3\2\2\2\63\u00c3\3\2\2\2\65\u00c5\3\2\2\2\67"+
		"\u00c9\3\2\2\29\u00cb\3\2\2\2;\u00cd\3\2\2\2=\u00cf\3\2\2\2?\u00d4\3\2"+
		"\2\2A\u00e8\3\2\2\2C\u00ea\3\2\2\2E\u00f9\3\2\2\2G\u00fb\3\2\2\2I\u00fd"+
		"\3\2\2\2K\u00ff\3\2\2\2M\u0101\3\2\2\2O\u0103\3\2\2\2Q\u0106\3\2\2\2S"+
		"\u010e\3\2\2\2UV\7t\2\2VW\7w\2\2WX\7n\2\2XY\7g\2\2YZ\7u\2\2Z[\7<\2\2["+
		"\4\3\2\2\2\\]\7k\2\2]^\7p\2\2^_\7k\2\2_`\7v\2\2`a\7a\2\2ab\7g\2\2bc\7"+
		"p\2\2cd\7x\2\2de\7k\2\2ef\7t\2\2fg\7q\2\2gh\7p\2\2hi\7o\2\2ij\7g\2\2j"+
		"k\7p\2\2kl\7v\2\2lm\7<\2\2m\6\3\2\2\2no\7k\2\2op\7v\2\2pq\7g\2\2qr\7t"+
		"\2\2rs\7c\2\2st\7v\2\2tu\7k\2\2uv\7q\2\2vw\7p\2\2wx\7u\2\2x\b\3\2\2\2"+
		"yz\7?\2\2z\n\3\2\2\2{|\7=\2\2|\f\3\2\2\2}~\7k\2\2~\177\7p\2\2\177\u0080"+
		"\7k\2\2\u0080\u0081\7v\2\2\u0081\u0082\7a\2\2\u0082\u0083\7r\2\2\u0083"+
		"\u0084\7q\2\2\u0084\u0085\7r\2\2\u0085\u0086\7w\2\2\u0086\u0087\7n\2\2"+
		"\u0087\u0088\7c\2\2\u0088\u0089\7v\2\2\u0089\u008a\7k\2\2\u008a\u008b"+
		"\7q\2\2\u008b\u008c\7p\2\2\u008c\u008d\7<\2\2\u008d\16\3\2\2\2\u008e\u008f"+
		"\7u\2\2\u008f\u0090\7k\2\2\u0090\u0091\7|\2\2\u0091\u0092\7g\2\2\u0092"+
		"\u0093\7?\2\2\u0093\20\3\2\2\2\u0094\u0095\7,\2\2\u0095\22\3\2\2\2\u0096"+
		"\u0097\7\61\2\2\u0097\24\3\2\2\2\u0098\u0099\7`\2\2\u0099\26\3\2\2\2\u009a"+
		"\u009b\7\'\2\2\u009b\30\3\2\2\2\u009c\u009d\7t\2\2\u009d\u009e\7c\2\2"+
		"\u009e\u009f\7p\2\2\u009f\u00a0\7f\2\2\u00a0\32\3\2\2\2\u00a1\u00a2\7"+
		".\2\2\u00a2\34\3\2\2\2\u00a3\u00a4\7o\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6"+
		"\7z\2\2\u00a6\36\3\2\2\2\u00a7\u00a8\7o\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa"+
		"\7p\2\2\u00aa \3\2\2\2\u00ab\u00ac\7#\2\2\u00ac\u00ad\7?\2\2\u00ad\"\3"+
		"\2\2\2\u00ae\u00af\7?\2\2\u00af\u00b0\7?\2\2\u00b0$\3\2\2\2\u00b1\u00b2"+
		"\7>\2\2\u00b2&\3\2\2\2\u00b3\u00b4\7@\2\2\u00b4(\3\2\2\2\u00b5\u00b6\7"+
		"@\2\2\u00b6\u00b7\7?\2\2\u00b7*\3\2\2\2\u00b8\u00b9\7>\2\2\u00b9\u00ba"+
		"\7?\2\2\u00ba,\3\2\2\2\u00bb\u00bc\7(\2\2\u00bc\u00bd\7(\2\2\u00bd.\3"+
		"\2\2\2\u00be\u00bf\7~\2\2\u00bf\u00c0\7~\2\2\u00c0\60\3\2\2\2\u00c1\u00c2"+
		"\7}\2\2\u00c2\62\3\2\2\2\u00c3\u00c4\7\177\2\2\u00c4\64\3\2\2\2\u00c5"+
		"\u00c6\7c\2\2\u00c6\u00c7\7x\2\2\u00c7\u00c8\7i\2\2\u00c8\66\3\2\2\2\u00c9"+
		"\u00ca\7-\2\2\u00ca8\3\2\2\2\u00cb\u00cc\7/\2\2\u00cc:\3\2\2\2\u00cd\u00ce"+
		"\7#\2\2\u00ce<\3\2\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7n\2\2\u00d1\u00d2"+
		"\7u\2\2\u00d2\u00d3\7g\2\2\u00d3>\3\2\2\2\u00d4\u00db\5A!\2\u00d5\u00d7"+
		"\7\60\2\2\u00d6\u00d8\t\2\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2"+
		"\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00d5"+
		"\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00df\5C\"\2\u00de"+
		"\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df@\3\2\2\2\u00e0\u00e9\7\62\2\2"+
		"\u00e1\u00e5\t\3\2\2\u00e2\u00e4\t\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7"+
		"\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e8\u00e0\3\2\2\2\u00e8\u00e1\3\2\2\2\u00e9B\3\2\2\2"+
		"\u00ea\u00ec\t\4\2\2\u00eb\u00ed\t\5\2\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed"+
		"\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\5A!\2\u00efD\3\2\2\2\u00f0\u00f1"+
		"\7v\2\2\u00f1\u00f2\7t\2\2\u00f2\u00f3\7w\2\2\u00f3\u00fa\7g\2\2\u00f4"+
		"\u00f5\7h\2\2\u00f5\u00f6\7c\2\2\u00f6\u00f7\7n\2\2\u00f7\u00f8\7u\2\2"+
		"\u00f8\u00fa\7g\2\2\u00f9\u00f0\3\2\2\2\u00f9\u00f4\3\2\2\2\u00faF\3\2"+
		"\2\2\u00fb\u00fc\7]\2\2\u00fcH\3\2\2\2\u00fd\u00fe\7_\2\2\u00feJ\3\2\2"+
		"\2\u00ff\u0100\7*\2\2\u0100L\3\2\2\2\u0101\u0102\7+\2\2\u0102N\3\2\2\2"+
		"\u0103\u0104\7k\2\2\u0104\u0105\7h\2\2\u0105P\3\2\2\2\u0106\u010a\t\6"+
		"\2\2\u0107\u0109\t\7\2\2\u0108\u0107\3\2\2\2\u0109\u010c\3\2\2\2\u010a"+
		"\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010bR\3\2\2\2\u010c\u010a\3\2\2\2"+
		"\u010d\u010f\t\b\2\2\u010e\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u010e"+
		"\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\b*\2\2\u0113"+
		"T\3\2\2\2\f\2\u00d9\u00db\u00de\u00e5\u00e8\u00ec\u00f9\u010a\u0110\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}