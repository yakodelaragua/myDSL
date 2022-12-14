package diazdecerio.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import diazdecerio.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'.dis2022;'", "'public'", "'class'", "'{'", "'int'", "'a'", "'='", "'0'", "';'", "'b'", "'}'", "'static'", "'void'", "'main'", "'('", "'String'", "'['", "']'", "'args'", "')'", "'s'", "'new'", "'()'", "'+='", "'*='", "'/='", "'while'", "'!='"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "JavaClass";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleJavaClass"
    // InternalMyDsl.g:65:1: entryRuleJavaClass returns [EObject current=null] : iv_ruleJavaClass= ruleJavaClass EOF ;
    public final EObject entryRuleJavaClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJavaClass = null;


        try {
            // InternalMyDsl.g:65:50: (iv_ruleJavaClass= ruleJavaClass EOF )
            // InternalMyDsl.g:66:2: iv_ruleJavaClass= ruleJavaClass EOF
            {
             newCompositeNode(grammarAccess.getJavaClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJavaClass=ruleJavaClass();

            state._fsp--;

             current =iv_ruleJavaClass; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJavaClass"


    // $ANTLR start "ruleJavaClass"
    // InternalMyDsl.g:72:1: ruleJavaClass returns [EObject current=null] : (otherlv_0= 'package' ( (lv_packageName_1_0= RULE_ID ) ) otherlv_2= '.dis2022;' otherlv_3= 'public' otherlv_4= 'class' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' otherlv_7= 'int' otherlv_8= 'a' otherlv_9= '=' otherlv_10= '0' otherlv_11= ';' otherlv_12= 'int' otherlv_13= 'b' otherlv_14= '=' otherlv_15= '0' otherlv_16= ';' ( ( ( ( ({...}? => ( ({...}? => ( (lv_constructor_18_0= ruleConstructor ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_main_19_0= ruleMain ) ) ) ) ) )+ {...}?) ) ) otherlv_20= '}' ) ;
    public final EObject ruleJavaClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_packageName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_20=null;
        EObject lv_constructor_18_0 = null;

        EObject lv_main_19_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( (otherlv_0= 'package' ( (lv_packageName_1_0= RULE_ID ) ) otherlv_2= '.dis2022;' otherlv_3= 'public' otherlv_4= 'class' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' otherlv_7= 'int' otherlv_8= 'a' otherlv_9= '=' otherlv_10= '0' otherlv_11= ';' otherlv_12= 'int' otherlv_13= 'b' otherlv_14= '=' otherlv_15= '0' otherlv_16= ';' ( ( ( ( ({...}? => ( ({...}? => ( (lv_constructor_18_0= ruleConstructor ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_main_19_0= ruleMain ) ) ) ) ) )+ {...}?) ) ) otherlv_20= '}' ) )
            // InternalMyDsl.g:79:2: (otherlv_0= 'package' ( (lv_packageName_1_0= RULE_ID ) ) otherlv_2= '.dis2022;' otherlv_3= 'public' otherlv_4= 'class' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' otherlv_7= 'int' otherlv_8= 'a' otherlv_9= '=' otherlv_10= '0' otherlv_11= ';' otherlv_12= 'int' otherlv_13= 'b' otherlv_14= '=' otherlv_15= '0' otherlv_16= ';' ( ( ( ( ({...}? => ( ({...}? => ( (lv_constructor_18_0= ruleConstructor ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_main_19_0= ruleMain ) ) ) ) ) )+ {...}?) ) ) otherlv_20= '}' )
            {
            // InternalMyDsl.g:79:2: (otherlv_0= 'package' ( (lv_packageName_1_0= RULE_ID ) ) otherlv_2= '.dis2022;' otherlv_3= 'public' otherlv_4= 'class' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' otherlv_7= 'int' otherlv_8= 'a' otherlv_9= '=' otherlv_10= '0' otherlv_11= ';' otherlv_12= 'int' otherlv_13= 'b' otherlv_14= '=' otherlv_15= '0' otherlv_16= ';' ( ( ( ( ({...}? => ( ({...}? => ( (lv_constructor_18_0= ruleConstructor ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_main_19_0= ruleMain ) ) ) ) ) )+ {...}?) ) ) otherlv_20= '}' )
            // InternalMyDsl.g:80:3: otherlv_0= 'package' ( (lv_packageName_1_0= RULE_ID ) ) otherlv_2= '.dis2022;' otherlv_3= 'public' otherlv_4= 'class' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' otherlv_7= 'int' otherlv_8= 'a' otherlv_9= '=' otherlv_10= '0' otherlv_11= ';' otherlv_12= 'int' otherlv_13= 'b' otherlv_14= '=' otherlv_15= '0' otherlv_16= ';' ( ( ( ( ({...}? => ( ({...}? => ( (lv_constructor_18_0= ruleConstructor ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_main_19_0= ruleMain ) ) ) ) ) )+ {...}?) ) ) otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJavaClassAccess().getPackageKeyword_0());
            		
            // InternalMyDsl.g:84:3: ( (lv_packageName_1_0= RULE_ID ) )
            // InternalMyDsl.g:85:4: (lv_packageName_1_0= RULE_ID )
            {
            // InternalMyDsl.g:85:4: (lv_packageName_1_0= RULE_ID )
            // InternalMyDsl.g:86:5: lv_packageName_1_0= RULE_ID
            {
            lv_packageName_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_packageName_1_0, grammarAccess.getJavaClassAccess().getPackageNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJavaClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"packageName",
            						lv_packageName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getJavaClassAccess().getDis2022Keyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getJavaClassAccess().getPublicKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getJavaClassAccess().getClassKeyword_4());
            		
            // InternalMyDsl.g:114:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalMyDsl.g:115:4: (lv_name_5_0= RULE_ID )
            {
            // InternalMyDsl.g:115:4: (lv_name_5_0= RULE_ID )
            // InternalMyDsl.g:116:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_5_0, grammarAccess.getJavaClassAccess().getNameIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJavaClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getJavaClassAccess().getLeftCurlyBracketKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getJavaClassAccess().getIntKeyword_7());
            		
            otherlv_8=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getJavaClassAccess().getAKeyword_8());
            		
            otherlv_9=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_9, grammarAccess.getJavaClassAccess().getEqualsSignKeyword_9());
            		
            otherlv_10=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_10, grammarAccess.getJavaClassAccess().getDigitZeroKeyword_10());
            		
            otherlv_11=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_11, grammarAccess.getJavaClassAccess().getSemicolonKeyword_11());
            		
            otherlv_12=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_12, grammarAccess.getJavaClassAccess().getIntKeyword_12());
            		
            otherlv_13=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_13, grammarAccess.getJavaClassAccess().getBKeyword_13());
            		
            otherlv_14=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_14, grammarAccess.getJavaClassAccess().getEqualsSignKeyword_14());
            		
            otherlv_15=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_15, grammarAccess.getJavaClassAccess().getDigitZeroKeyword_15());
            		
            otherlv_16=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_16, grammarAccess.getJavaClassAccess().getSemicolonKeyword_16());
            		
            // InternalMyDsl.g:176:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_constructor_18_0= ruleConstructor ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_main_19_0= ruleMain ) ) ) ) ) )+ {...}?) ) )
            // InternalMyDsl.g:177:4: ( ( ( ({...}? => ( ({...}? => ( (lv_constructor_18_0= ruleConstructor ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_main_19_0= ruleMain ) ) ) ) ) )+ {...}?) )
            {
            // InternalMyDsl.g:177:4: ( ( ( ({...}? => ( ({...}? => ( (lv_constructor_18_0= ruleConstructor ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_main_19_0= ruleMain ) ) ) ) ) )+ {...}?) )
            // InternalMyDsl.g:178:5: ( ( ({...}? => ( ({...}? => ( (lv_constructor_18_0= ruleConstructor ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_main_19_0= ruleMain ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getJavaClassAccess().getUnorderedGroup_17());
            				
            // InternalMyDsl.g:181:5: ( ( ({...}? => ( ({...}? => ( (lv_constructor_18_0= ruleConstructor ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_main_19_0= ruleMain ) ) ) ) ) )+ {...}?)
            // InternalMyDsl.g:182:6: ( ({...}? => ( ({...}? => ( (lv_constructor_18_0= ruleConstructor ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_main_19_0= ruleMain ) ) ) ) ) )+ {...}?
            {
            // InternalMyDsl.g:182:6: ( ({...}? => ( ({...}? => ( (lv_constructor_18_0= ruleConstructor ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_main_19_0= ruleMain ) ) ) ) ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( LA1_0 == 13 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getJavaClassAccess().getUnorderedGroup_17(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getJavaClassAccess().getUnorderedGroup_17(), 0) ) ) {
                    int LA1_2 = input.LA(2);

                    if ( LA1_2 == RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getJavaClassAccess().getUnorderedGroup_17(), 0) ) {
                        alt1=1;
                    }
                    else if ( LA1_2 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getJavaClassAccess().getUnorderedGroup_17(), 1) ) {
                        alt1=2;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:183:4: ({...}? => ( ({...}? => ( (lv_constructor_18_0= ruleConstructor ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:183:4: ({...}? => ( ({...}? => ( (lv_constructor_18_0= ruleConstructor ) ) ) ) )
            	    // InternalMyDsl.g:184:5: {...}? => ( ({...}? => ( (lv_constructor_18_0= ruleConstructor ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJavaClassAccess().getUnorderedGroup_17(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleJavaClass", "getUnorderedGroupHelper().canSelect(grammarAccess.getJavaClassAccess().getUnorderedGroup_17(), 0)");
            	    }
            	    // InternalMyDsl.g:184:107: ( ({...}? => ( (lv_constructor_18_0= ruleConstructor ) ) ) )
            	    // InternalMyDsl.g:185:6: ({...}? => ( (lv_constructor_18_0= ruleConstructor ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJavaClassAccess().getUnorderedGroup_17(), 0);
            	    					
            	    // InternalMyDsl.g:188:9: ({...}? => ( (lv_constructor_18_0= ruleConstructor ) ) )
            	    // InternalMyDsl.g:188:10: {...}? => ( (lv_constructor_18_0= ruleConstructor ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJavaClass", "true");
            	    }
            	    // InternalMyDsl.g:188:19: ( (lv_constructor_18_0= ruleConstructor ) )
            	    // InternalMyDsl.g:188:20: (lv_constructor_18_0= ruleConstructor )
            	    {
            	    // InternalMyDsl.g:188:20: (lv_constructor_18_0= ruleConstructor )
            	    // InternalMyDsl.g:189:10: lv_constructor_18_0= ruleConstructor
            	    {

            	    										newCompositeNode(grammarAccess.getJavaClassAccess().getConstructorConstructorParserRuleCall_17_0_0());
            	    									
            	    pushFollow(FOLLOW_14);
            	    lv_constructor_18_0=ruleConstructor();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getJavaClassRule());
            	    										}
            	    										set(
            	    											current,
            	    											"constructor",
            	    											lv_constructor_18_0,
            	    											"diazdecerio.mydsl.MyDsl.Constructor");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJavaClassAccess().getUnorderedGroup_17());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:211:4: ({...}? => ( ({...}? => ( (lv_main_19_0= ruleMain ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:211:4: ({...}? => ( ({...}? => ( (lv_main_19_0= ruleMain ) ) ) ) )
            	    // InternalMyDsl.g:212:5: {...}? => ( ({...}? => ( (lv_main_19_0= ruleMain ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJavaClassAccess().getUnorderedGroup_17(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleJavaClass", "getUnorderedGroupHelper().canSelect(grammarAccess.getJavaClassAccess().getUnorderedGroup_17(), 1)");
            	    }
            	    // InternalMyDsl.g:212:107: ( ({...}? => ( (lv_main_19_0= ruleMain ) ) ) )
            	    // InternalMyDsl.g:213:6: ({...}? => ( (lv_main_19_0= ruleMain ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJavaClassAccess().getUnorderedGroup_17(), 1);
            	    					
            	    // InternalMyDsl.g:216:9: ({...}? => ( (lv_main_19_0= ruleMain ) ) )
            	    // InternalMyDsl.g:216:10: {...}? => ( (lv_main_19_0= ruleMain ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJavaClass", "true");
            	    }
            	    // InternalMyDsl.g:216:19: ( (lv_main_19_0= ruleMain ) )
            	    // InternalMyDsl.g:216:20: (lv_main_19_0= ruleMain )
            	    {
            	    // InternalMyDsl.g:216:20: (lv_main_19_0= ruleMain )
            	    // InternalMyDsl.g:217:10: lv_main_19_0= ruleMain
            	    {

            	    										newCompositeNode(grammarAccess.getJavaClassAccess().getMainMainParserRuleCall_17_1_0());
            	    									
            	    pushFollow(FOLLOW_14);
            	    lv_main_19_0=ruleMain();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getJavaClassRule());
            	    										}
            	    										set(
            	    											current,
            	    											"main",
            	    											lv_main_19_0,
            	    											"diazdecerio.mydsl.MyDsl.Main");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJavaClassAccess().getUnorderedGroup_17());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getJavaClassAccess().getUnorderedGroup_17()) ) {
                throw new FailedPredicateException(input, "ruleJavaClass", "getUnorderedGroupHelper().canLeave(grammarAccess.getJavaClassAccess().getUnorderedGroup_17())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getJavaClassAccess().getUnorderedGroup_17());
            				

            }

            otherlv_20=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getJavaClassAccess().getRightCurlyBracketKeyword_18());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJavaClass"


    // $ANTLR start "entryRuleMain"
    // InternalMyDsl.g:255:1: entryRuleMain returns [EObject current=null] : iv_ruleMain= ruleMain EOF ;
    public final EObject entryRuleMain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMain = null;


        try {
            // InternalMyDsl.g:255:45: (iv_ruleMain= ruleMain EOF )
            // InternalMyDsl.g:256:2: iv_ruleMain= ruleMain EOF
            {
             newCompositeNode(grammarAccess.getMainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMain=ruleMain();

            state._fsp--;

             current =iv_ruleMain; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMain"


    // $ANTLR start "ruleMain"
    // InternalMyDsl.g:262:1: ruleMain returns [EObject current=null] : (otherlv_0= 'public' otherlv_1= 'static' otherlv_2= 'void' otherlv_3= 'main' otherlv_4= '(' otherlv_5= 'String' otherlv_6= '[' otherlv_7= ']' otherlv_8= 'args' otherlv_9= ')' otherlv_10= '{' ( (otherlv_11= RULE_ID ) ) otherlv_12= 's' otherlv_13= '=' otherlv_14= 'new' ( (otherlv_15= RULE_ID ) ) otherlv_16= '()' otherlv_17= ';' otherlv_18= '}' ) ;
    public final EObject ruleMain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;


        	enterRule();

        try {
            // InternalMyDsl.g:268:2: ( (otherlv_0= 'public' otherlv_1= 'static' otherlv_2= 'void' otherlv_3= 'main' otherlv_4= '(' otherlv_5= 'String' otherlv_6= '[' otherlv_7= ']' otherlv_8= 'args' otherlv_9= ')' otherlv_10= '{' ( (otherlv_11= RULE_ID ) ) otherlv_12= 's' otherlv_13= '=' otherlv_14= 'new' ( (otherlv_15= RULE_ID ) ) otherlv_16= '()' otherlv_17= ';' otherlv_18= '}' ) )
            // InternalMyDsl.g:269:2: (otherlv_0= 'public' otherlv_1= 'static' otherlv_2= 'void' otherlv_3= 'main' otherlv_4= '(' otherlv_5= 'String' otherlv_6= '[' otherlv_7= ']' otherlv_8= 'args' otherlv_9= ')' otherlv_10= '{' ( (otherlv_11= RULE_ID ) ) otherlv_12= 's' otherlv_13= '=' otherlv_14= 'new' ( (otherlv_15= RULE_ID ) ) otherlv_16= '()' otherlv_17= ';' otherlv_18= '}' )
            {
            // InternalMyDsl.g:269:2: (otherlv_0= 'public' otherlv_1= 'static' otherlv_2= 'void' otherlv_3= 'main' otherlv_4= '(' otherlv_5= 'String' otherlv_6= '[' otherlv_7= ']' otherlv_8= 'args' otherlv_9= ')' otherlv_10= '{' ( (otherlv_11= RULE_ID ) ) otherlv_12= 's' otherlv_13= '=' otherlv_14= 'new' ( (otherlv_15= RULE_ID ) ) otherlv_16= '()' otherlv_17= ';' otherlv_18= '}' )
            // InternalMyDsl.g:270:3: otherlv_0= 'public' otherlv_1= 'static' otherlv_2= 'void' otherlv_3= 'main' otherlv_4= '(' otherlv_5= 'String' otherlv_6= '[' otherlv_7= ']' otherlv_8= 'args' otherlv_9= ')' otherlv_10= '{' ( (otherlv_11= RULE_ID ) ) otherlv_12= 's' otherlv_13= '=' otherlv_14= 'new' ( (otherlv_15= RULE_ID ) ) otherlv_16= '()' otherlv_17= ';' otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getMainAccess().getPublicKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getMainAccess().getStaticKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getMainAccess().getVoidKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getMainAccess().getMainKeyword_3());
            		
            otherlv_4=(Token)match(input,26,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getMainAccess().getLeftParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,27,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getMainAccess().getStringKeyword_5());
            		
            otherlv_6=(Token)match(input,28,FOLLOW_21); 

            			newLeafNode(otherlv_6, grammarAccess.getMainAccess().getLeftSquareBracketKeyword_6());
            		
            otherlv_7=(Token)match(input,29,FOLLOW_22); 

            			newLeafNode(otherlv_7, grammarAccess.getMainAccess().getRightSquareBracketKeyword_7());
            		
            otherlv_8=(Token)match(input,30,FOLLOW_23); 

            			newLeafNode(otherlv_8, grammarAccess.getMainAccess().getArgsKeyword_8());
            		
            otherlv_9=(Token)match(input,31,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getMainAccess().getRightParenthesisKeyword_9());
            		
            otherlv_10=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getMainAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalMyDsl.g:314:3: ( (otherlv_11= RULE_ID ) )
            // InternalMyDsl.g:315:4: (otherlv_11= RULE_ID )
            {
            // InternalMyDsl.g:315:4: (otherlv_11= RULE_ID )
            // InternalMyDsl.g:316:5: otherlv_11= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMainRule());
            					}
            				
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_11, grammarAccess.getMainAccess().getTheTypeJavaClassCrossReference_11_0());
            				

            }


            }

            otherlv_12=(Token)match(input,32,FOLLOW_10); 

            			newLeafNode(otherlv_12, grammarAccess.getMainAccess().getSKeyword_12());
            		
            otherlv_13=(Token)match(input,18,FOLLOW_25); 

            			newLeafNode(otherlv_13, grammarAccess.getMainAccess().getEqualsSignKeyword_13());
            		
            otherlv_14=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_14, grammarAccess.getMainAccess().getNewKeyword_14());
            		
            // InternalMyDsl.g:339:3: ( (otherlv_15= RULE_ID ) )
            // InternalMyDsl.g:340:4: (otherlv_15= RULE_ID )
            {
            // InternalMyDsl.g:340:4: (otherlv_15= RULE_ID )
            // InternalMyDsl.g:341:5: otherlv_15= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMainRule());
            					}
            				
            otherlv_15=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_15, grammarAccess.getMainAccess().getAgainJavaClassCrossReference_15_0());
            				

            }


            }

            otherlv_16=(Token)match(input,34,FOLLOW_12); 

            			newLeafNode(otherlv_16, grammarAccess.getMainAccess().getLeftParenthesisRightParenthesisKeyword_16());
            		
            otherlv_17=(Token)match(input,20,FOLLOW_27); 

            			newLeafNode(otherlv_17, grammarAccess.getMainAccess().getSemicolonKeyword_17());
            		
            otherlv_18=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getMainAccess().getRightCurlyBracketKeyword_18());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleConstructor"
    // InternalMyDsl.g:368:1: entryRuleConstructor returns [EObject current=null] : iv_ruleConstructor= ruleConstructor EOF ;
    public final EObject entryRuleConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructor = null;


        try {
            // InternalMyDsl.g:368:52: (iv_ruleConstructor= ruleConstructor EOF )
            // InternalMyDsl.g:369:2: iv_ruleConstructor= ruleConstructor EOF
            {
             newCompositeNode(grammarAccess.getConstructorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstructor=ruleConstructor();

            state._fsp--;

             current =iv_ruleConstructor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstructor"


    // $ANTLR start "ruleConstructor"
    // InternalMyDsl.g:375:1: ruleConstructor returns [EObject current=null] : (otherlv_0= 'public' ( (otherlv_1= RULE_ID ) ) otherlv_2= '()' otherlv_3= '{' ( (lv_stmts_4_0= ruleStmt ) )+ otherlv_5= '}' ) ;
    public final EObject ruleConstructor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_stmts_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:381:2: ( (otherlv_0= 'public' ( (otherlv_1= RULE_ID ) ) otherlv_2= '()' otherlv_3= '{' ( (lv_stmts_4_0= ruleStmt ) )+ otherlv_5= '}' ) )
            // InternalMyDsl.g:382:2: (otherlv_0= 'public' ( (otherlv_1= RULE_ID ) ) otherlv_2= '()' otherlv_3= '{' ( (lv_stmts_4_0= ruleStmt ) )+ otherlv_5= '}' )
            {
            // InternalMyDsl.g:382:2: (otherlv_0= 'public' ( (otherlv_1= RULE_ID ) ) otherlv_2= '()' otherlv_3= '{' ( (lv_stmts_4_0= ruleStmt ) )+ otherlv_5= '}' )
            // InternalMyDsl.g:383:3: otherlv_0= 'public' ( (otherlv_1= RULE_ID ) ) otherlv_2= '()' otherlv_3= '{' ( (lv_stmts_4_0= ruleStmt ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConstructorAccess().getPublicKeyword_0());
            		
            // InternalMyDsl.g:387:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:388:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:388:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:389:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstructorRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_1, grammarAccess.getConstructorAccess().getConstructorJavaClassCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,34,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getConstructorAccess().getLeftParenthesisRightParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_28); 

            			newLeafNode(otherlv_3, grammarAccess.getConstructorAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:408:3: ( (lv_stmts_4_0= ruleStmt ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17||LA2_0==21||LA2_0==38) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:409:4: (lv_stmts_4_0= ruleStmt )
            	    {
            	    // InternalMyDsl.g:409:4: (lv_stmts_4_0= ruleStmt )
            	    // InternalMyDsl.g:410:5: lv_stmts_4_0= ruleStmt
            	    {

            	    					newCompositeNode(grammarAccess.getConstructorAccess().getStmtsStmtParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_stmts_4_0=ruleStmt();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConstructorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"stmts",
            	    						lv_stmts_4_0,
            	    						"diazdecerio.mydsl.MyDsl.Stmt");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getConstructorAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstructor"


    // $ANTLR start "entryRuleStmt"
    // InternalMyDsl.g:435:1: entryRuleStmt returns [EObject current=null] : iv_ruleStmt= ruleStmt EOF ;
    public final EObject entryRuleStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStmt = null;


        try {
            // InternalMyDsl.g:435:45: (iv_ruleStmt= ruleStmt EOF )
            // InternalMyDsl.g:436:2: iv_ruleStmt= ruleStmt EOF
            {
             newCompositeNode(grammarAccess.getStmtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStmt=ruleStmt();

            state._fsp--;

             current =iv_ruleStmt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStmt"


    // $ANTLR start "ruleStmt"
    // InternalMyDsl.g:442:1: ruleStmt returns [EObject current=null] : (this_SumStmt_0= ruleSumStmt | this_MulStmt_1= ruleMulStmt | this_DivStmt_2= ruleDivStmt | this_WhileStmt_3= ruleWhileStmt ) ;
    public final EObject ruleStmt() throws RecognitionException {
        EObject current = null;

        EObject this_SumStmt_0 = null;

        EObject this_MulStmt_1 = null;

        EObject this_DivStmt_2 = null;

        EObject this_WhileStmt_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:448:2: ( (this_SumStmt_0= ruleSumStmt | this_MulStmt_1= ruleMulStmt | this_DivStmt_2= ruleDivStmt | this_WhileStmt_3= ruleWhileStmt ) )
            // InternalMyDsl.g:449:2: (this_SumStmt_0= ruleSumStmt | this_MulStmt_1= ruleMulStmt | this_DivStmt_2= ruleDivStmt | this_WhileStmt_3= ruleWhileStmt )
            {
            // InternalMyDsl.g:449:2: (this_SumStmt_0= ruleSumStmt | this_MulStmt_1= ruleMulStmt | this_DivStmt_2= ruleDivStmt | this_WhileStmt_3= ruleWhileStmt )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                switch ( input.LA(2) ) {
                case 37:
                    {
                    alt3=3;
                    }
                    break;
                case 36:
                    {
                    alt3=2;
                    }
                    break;
                case 35:
                    {
                    alt3=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }

                }
                break;
            case 21:
                {
                switch ( input.LA(2) ) {
                case 35:
                    {
                    alt3=1;
                    }
                    break;
                case 37:
                    {
                    alt3=3;
                    }
                    break;
                case 36:
                    {
                    alt3=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }

                }
                break;
            case 38:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:450:3: this_SumStmt_0= ruleSumStmt
                    {

                    			newCompositeNode(grammarAccess.getStmtAccess().getSumStmtParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SumStmt_0=ruleSumStmt();

                    state._fsp--;


                    			current = this_SumStmt_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:459:3: this_MulStmt_1= ruleMulStmt
                    {

                    			newCompositeNode(grammarAccess.getStmtAccess().getMulStmtParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MulStmt_1=ruleMulStmt();

                    state._fsp--;


                    			current = this_MulStmt_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:468:3: this_DivStmt_2= ruleDivStmt
                    {

                    			newCompositeNode(grammarAccess.getStmtAccess().getDivStmtParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DivStmt_2=ruleDivStmt();

                    state._fsp--;


                    			current = this_DivStmt_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:477:3: this_WhileStmt_3= ruleWhileStmt
                    {

                    			newCompositeNode(grammarAccess.getStmtAccess().getWhileStmtParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_WhileStmt_3=ruleWhileStmt();

                    state._fsp--;


                    			current = this_WhileStmt_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStmt"


    // $ANTLR start "entryRuleSumStmt"
    // InternalMyDsl.g:489:1: entryRuleSumStmt returns [EObject current=null] : iv_ruleSumStmt= ruleSumStmt EOF ;
    public final EObject entryRuleSumStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumStmt = null;


        try {
            // InternalMyDsl.g:489:48: (iv_ruleSumStmt= ruleSumStmt EOF )
            // InternalMyDsl.g:490:2: iv_ruleSumStmt= ruleSumStmt EOF
            {
             newCompositeNode(grammarAccess.getSumStmtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSumStmt=ruleSumStmt();

            state._fsp--;

             current =iv_ruleSumStmt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSumStmt"


    // $ANTLR start "ruleSumStmt"
    // InternalMyDsl.g:496:1: ruleSumStmt returns [EObject current=null] : ( ( (lv_reg_0_0= ruleRegister ) ) otherlv_1= '+=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';' ) ;
    public final EObject ruleSumStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_reg_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:502:2: ( ( ( (lv_reg_0_0= ruleRegister ) ) otherlv_1= '+=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';' ) )
            // InternalMyDsl.g:503:2: ( ( (lv_reg_0_0= ruleRegister ) ) otherlv_1= '+=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';' )
            {
            // InternalMyDsl.g:503:2: ( ( (lv_reg_0_0= ruleRegister ) ) otherlv_1= '+=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';' )
            // InternalMyDsl.g:504:3: ( (lv_reg_0_0= ruleRegister ) ) otherlv_1= '+=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';'
            {
            // InternalMyDsl.g:504:3: ( (lv_reg_0_0= ruleRegister ) )
            // InternalMyDsl.g:505:4: (lv_reg_0_0= ruleRegister )
            {
            // InternalMyDsl.g:505:4: (lv_reg_0_0= ruleRegister )
            // InternalMyDsl.g:506:5: lv_reg_0_0= ruleRegister
            {

            					newCompositeNode(grammarAccess.getSumStmtAccess().getRegRegisterEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_30);
            lv_reg_0_0=ruleRegister();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSumStmtRule());
            					}
            					set(
            						current,
            						"reg",
            						lv_reg_0_0,
            						"diazdecerio.mydsl.MyDsl.Register");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getSumStmtAccess().getPlusSignEqualsSignKeyword_1());
            		
            // InternalMyDsl.g:527:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalMyDsl.g:528:4: (lv_value_2_0= RULE_INT )
            {
            // InternalMyDsl.g:528:4: (lv_value_2_0= RULE_INT )
            // InternalMyDsl.g:529:5: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_value_2_0, grammarAccess.getSumStmtAccess().getValueINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSumStmtRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSumStmtAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSumStmt"


    // $ANTLR start "entryRuleMulStmt"
    // InternalMyDsl.g:553:1: entryRuleMulStmt returns [EObject current=null] : iv_ruleMulStmt= ruleMulStmt EOF ;
    public final EObject entryRuleMulStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulStmt = null;


        try {
            // InternalMyDsl.g:553:48: (iv_ruleMulStmt= ruleMulStmt EOF )
            // InternalMyDsl.g:554:2: iv_ruleMulStmt= ruleMulStmt EOF
            {
             newCompositeNode(grammarAccess.getMulStmtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMulStmt=ruleMulStmt();

            state._fsp--;

             current =iv_ruleMulStmt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMulStmt"


    // $ANTLR start "ruleMulStmt"
    // InternalMyDsl.g:560:1: ruleMulStmt returns [EObject current=null] : ( ( (lv_reg_0_0= ruleRegister ) ) otherlv_1= '*=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';' ) ;
    public final EObject ruleMulStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_reg_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:566:2: ( ( ( (lv_reg_0_0= ruleRegister ) ) otherlv_1= '*=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';' ) )
            // InternalMyDsl.g:567:2: ( ( (lv_reg_0_0= ruleRegister ) ) otherlv_1= '*=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';' )
            {
            // InternalMyDsl.g:567:2: ( ( (lv_reg_0_0= ruleRegister ) ) otherlv_1= '*=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';' )
            // InternalMyDsl.g:568:3: ( (lv_reg_0_0= ruleRegister ) ) otherlv_1= '*=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';'
            {
            // InternalMyDsl.g:568:3: ( (lv_reg_0_0= ruleRegister ) )
            // InternalMyDsl.g:569:4: (lv_reg_0_0= ruleRegister )
            {
            // InternalMyDsl.g:569:4: (lv_reg_0_0= ruleRegister )
            // InternalMyDsl.g:570:5: lv_reg_0_0= ruleRegister
            {

            					newCompositeNode(grammarAccess.getMulStmtAccess().getRegRegisterEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_32);
            lv_reg_0_0=ruleRegister();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMulStmtRule());
            					}
            					set(
            						current,
            						"reg",
            						lv_reg_0_0,
            						"diazdecerio.mydsl.MyDsl.Register");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getMulStmtAccess().getAsteriskEqualsSignKeyword_1());
            		
            // InternalMyDsl.g:591:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalMyDsl.g:592:4: (lv_value_2_0= RULE_INT )
            {
            // InternalMyDsl.g:592:4: (lv_value_2_0= RULE_INT )
            // InternalMyDsl.g:593:5: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_value_2_0, grammarAccess.getMulStmtAccess().getValueINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMulStmtRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getMulStmtAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMulStmt"


    // $ANTLR start "entryRuleDivStmt"
    // InternalMyDsl.g:617:1: entryRuleDivStmt returns [EObject current=null] : iv_ruleDivStmt= ruleDivStmt EOF ;
    public final EObject entryRuleDivStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivStmt = null;


        try {
            // InternalMyDsl.g:617:48: (iv_ruleDivStmt= ruleDivStmt EOF )
            // InternalMyDsl.g:618:2: iv_ruleDivStmt= ruleDivStmt EOF
            {
             newCompositeNode(grammarAccess.getDivStmtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDivStmt=ruleDivStmt();

            state._fsp--;

             current =iv_ruleDivStmt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivStmt"


    // $ANTLR start "ruleDivStmt"
    // InternalMyDsl.g:624:1: ruleDivStmt returns [EObject current=null] : ( ( (lv_reg_0_0= ruleRegister ) ) otherlv_1= '/=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';' ) ;
    public final EObject ruleDivStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_reg_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:630:2: ( ( ( (lv_reg_0_0= ruleRegister ) ) otherlv_1= '/=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';' ) )
            // InternalMyDsl.g:631:2: ( ( (lv_reg_0_0= ruleRegister ) ) otherlv_1= '/=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';' )
            {
            // InternalMyDsl.g:631:2: ( ( (lv_reg_0_0= ruleRegister ) ) otherlv_1= '/=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';' )
            // InternalMyDsl.g:632:3: ( (lv_reg_0_0= ruleRegister ) ) otherlv_1= '/=' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ';'
            {
            // InternalMyDsl.g:632:3: ( (lv_reg_0_0= ruleRegister ) )
            // InternalMyDsl.g:633:4: (lv_reg_0_0= ruleRegister )
            {
            // InternalMyDsl.g:633:4: (lv_reg_0_0= ruleRegister )
            // InternalMyDsl.g:634:5: lv_reg_0_0= ruleRegister
            {

            					newCompositeNode(grammarAccess.getDivStmtAccess().getRegRegisterEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_33);
            lv_reg_0_0=ruleRegister();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDivStmtRule());
            					}
            					set(
            						current,
            						"reg",
            						lv_reg_0_0,
            						"diazdecerio.mydsl.MyDsl.Register");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,37,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getDivStmtAccess().getSolidusEqualsSignKeyword_1());
            		
            // InternalMyDsl.g:655:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalMyDsl.g:656:4: (lv_value_2_0= RULE_INT )
            {
            // InternalMyDsl.g:656:4: (lv_value_2_0= RULE_INT )
            // InternalMyDsl.g:657:5: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_value_2_0, grammarAccess.getDivStmtAccess().getValueINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDivStmtRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getDivStmtAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDivStmt"


    // $ANTLR start "entryRuleWhileStmt"
    // InternalMyDsl.g:681:1: entryRuleWhileStmt returns [EObject current=null] : iv_ruleWhileStmt= ruleWhileStmt EOF ;
    public final EObject entryRuleWhileStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStmt = null;


        try {
            // InternalMyDsl.g:681:50: (iv_ruleWhileStmt= ruleWhileStmt EOF )
            // InternalMyDsl.g:682:2: iv_ruleWhileStmt= ruleWhileStmt EOF
            {
             newCompositeNode(grammarAccess.getWhileStmtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhileStmt=ruleWhileStmt();

            state._fsp--;

             current =iv_ruleWhileStmt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhileStmt"


    // $ANTLR start "ruleWhileStmt"
    // InternalMyDsl.g:688:1: ruleWhileStmt returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_cond_2_0= ruleCondition ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_stmtsWhile_5_0= ruleStmt ) )+ otherlv_6= '}' ) ;
    public final EObject ruleWhileStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_cond_2_0 = null;

        EObject lv_stmtsWhile_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:694:2: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_cond_2_0= ruleCondition ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_stmtsWhile_5_0= ruleStmt ) )+ otherlv_6= '}' ) )
            // InternalMyDsl.g:695:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_cond_2_0= ruleCondition ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_stmtsWhile_5_0= ruleStmt ) )+ otherlv_6= '}' )
            {
            // InternalMyDsl.g:695:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_cond_2_0= ruleCondition ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_stmtsWhile_5_0= ruleStmt ) )+ otherlv_6= '}' )
            // InternalMyDsl.g:696:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_cond_2_0= ruleCondition ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_stmtsWhile_5_0= ruleStmt ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getWhileStmtAccess().getWhileKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getWhileStmtAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:704:3: ( (lv_cond_2_0= ruleCondition ) )
            // InternalMyDsl.g:705:4: (lv_cond_2_0= ruleCondition )
            {
            // InternalMyDsl.g:705:4: (lv_cond_2_0= ruleCondition )
            // InternalMyDsl.g:706:5: lv_cond_2_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getWhileStmtAccess().getCondConditionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
            lv_cond_2_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileStmtRule());
            					}
            					set(
            						current,
            						"cond",
            						lv_cond_2_0,
            						"diazdecerio.mydsl.MyDsl.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getWhileStmtAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_28); 

            			newLeafNode(otherlv_4, grammarAccess.getWhileStmtAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMyDsl.g:731:3: ( (lv_stmtsWhile_5_0= ruleStmt ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17||LA4_0==21||LA4_0==38) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:732:4: (lv_stmtsWhile_5_0= ruleStmt )
            	    {
            	    // InternalMyDsl.g:732:4: (lv_stmtsWhile_5_0= ruleStmt )
            	    // InternalMyDsl.g:733:5: lv_stmtsWhile_5_0= ruleStmt
            	    {

            	    					newCompositeNode(grammarAccess.getWhileStmtAccess().getStmtsWhileStmtParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_stmtsWhile_5_0=ruleStmt();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWhileStmtRule());
            	    					}
            	    					add(
            	    						current,
            	    						"stmtsWhile",
            	    						lv_stmtsWhile_5_0,
            	    						"diazdecerio.mydsl.MyDsl.Stmt");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getWhileStmtAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhileStmt"


    // $ANTLR start "entryRuleCondition"
    // InternalMyDsl.g:758:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalMyDsl.g:758:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalMyDsl.g:759:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalMyDsl.g:765:1: ruleCondition returns [EObject current=null] : ( ( ( (lv_reg_0_0= ruleRegister ) ) otherlv_1= '!=' ( (lv_number_2_0= RULE_INT ) ) ) | ( ( (lv_number_3_0= RULE_INT ) ) otherlv_4= '!=' ( (lv_reg_5_0= ruleRegister ) ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_number_2_0=null;
        Token lv_number_3_0=null;
        Token otherlv_4=null;
        Enumerator lv_reg_0_0 = null;

        Enumerator lv_reg_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:771:2: ( ( ( ( (lv_reg_0_0= ruleRegister ) ) otherlv_1= '!=' ( (lv_number_2_0= RULE_INT ) ) ) | ( ( (lv_number_3_0= RULE_INT ) ) otherlv_4= '!=' ( (lv_reg_5_0= ruleRegister ) ) ) ) )
            // InternalMyDsl.g:772:2: ( ( ( (lv_reg_0_0= ruleRegister ) ) otherlv_1= '!=' ( (lv_number_2_0= RULE_INT ) ) ) | ( ( (lv_number_3_0= RULE_INT ) ) otherlv_4= '!=' ( (lv_reg_5_0= ruleRegister ) ) ) )
            {
            // InternalMyDsl.g:772:2: ( ( ( (lv_reg_0_0= ruleRegister ) ) otherlv_1= '!=' ( (lv_number_2_0= RULE_INT ) ) ) | ( ( (lv_number_3_0= RULE_INT ) ) otherlv_4= '!=' ( (lv_reg_5_0= ruleRegister ) ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17||LA5_0==21) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_INT) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:773:3: ( ( (lv_reg_0_0= ruleRegister ) ) otherlv_1= '!=' ( (lv_number_2_0= RULE_INT ) ) )
                    {
                    // InternalMyDsl.g:773:3: ( ( (lv_reg_0_0= ruleRegister ) ) otherlv_1= '!=' ( (lv_number_2_0= RULE_INT ) ) )
                    // InternalMyDsl.g:774:4: ( (lv_reg_0_0= ruleRegister ) ) otherlv_1= '!=' ( (lv_number_2_0= RULE_INT ) )
                    {
                    // InternalMyDsl.g:774:4: ( (lv_reg_0_0= ruleRegister ) )
                    // InternalMyDsl.g:775:5: (lv_reg_0_0= ruleRegister )
                    {
                    // InternalMyDsl.g:775:5: (lv_reg_0_0= ruleRegister )
                    // InternalMyDsl.g:776:6: lv_reg_0_0= ruleRegister
                    {

                    						newCompositeNode(grammarAccess.getConditionAccess().getRegRegisterEnumRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_reg_0_0=ruleRegister();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionRule());
                    						}
                    						set(
                    							current,
                    							"reg",
                    							lv_reg_0_0,
                    							"diazdecerio.mydsl.MyDsl.Register");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,39,FOLLOW_31); 

                    				newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getExclamationMarkEqualsSignKeyword_0_1());
                    			
                    // InternalMyDsl.g:797:4: ( (lv_number_2_0= RULE_INT ) )
                    // InternalMyDsl.g:798:5: (lv_number_2_0= RULE_INT )
                    {
                    // InternalMyDsl.g:798:5: (lv_number_2_0= RULE_INT )
                    // InternalMyDsl.g:799:6: lv_number_2_0= RULE_INT
                    {
                    lv_number_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_number_2_0, grammarAccess.getConditionAccess().getNumberINTTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"number",
                    							lv_number_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:817:3: ( ( (lv_number_3_0= RULE_INT ) ) otherlv_4= '!=' ( (lv_reg_5_0= ruleRegister ) ) )
                    {
                    // InternalMyDsl.g:817:3: ( ( (lv_number_3_0= RULE_INT ) ) otherlv_4= '!=' ( (lv_reg_5_0= ruleRegister ) ) )
                    // InternalMyDsl.g:818:4: ( (lv_number_3_0= RULE_INT ) ) otherlv_4= '!=' ( (lv_reg_5_0= ruleRegister ) )
                    {
                    // InternalMyDsl.g:818:4: ( (lv_number_3_0= RULE_INT ) )
                    // InternalMyDsl.g:819:5: (lv_number_3_0= RULE_INT )
                    {
                    // InternalMyDsl.g:819:5: (lv_number_3_0= RULE_INT )
                    // InternalMyDsl.g:820:6: lv_number_3_0= RULE_INT
                    {
                    lv_number_3_0=(Token)match(input,RULE_INT,FOLLOW_35); 

                    						newLeafNode(lv_number_3_0, grammarAccess.getConditionAccess().getNumberINTTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"number",
                    							lv_number_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,39,FOLLOW_36); 

                    				newLeafNode(otherlv_4, grammarAccess.getConditionAccess().getExclamationMarkEqualsSignKeyword_1_1());
                    			
                    // InternalMyDsl.g:840:4: ( (lv_reg_5_0= ruleRegister ) )
                    // InternalMyDsl.g:841:5: (lv_reg_5_0= ruleRegister )
                    {
                    // InternalMyDsl.g:841:5: (lv_reg_5_0= ruleRegister )
                    // InternalMyDsl.g:842:6: lv_reg_5_0= ruleRegister
                    {

                    						newCompositeNode(grammarAccess.getConditionAccess().getRegRegisterEnumRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_reg_5_0=ruleRegister();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionRule());
                    						}
                    						set(
                    							current,
                    							"reg",
                    							lv_reg_5_0,
                    							"diazdecerio.mydsl.MyDsl.Register");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "ruleRegister"
    // InternalMyDsl.g:864:1: ruleRegister returns [Enumerator current=null] : ( (enumLiteral_0= 'a' ) | (enumLiteral_1= 'b' ) ) ;
    public final Enumerator ruleRegister() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:870:2: ( ( (enumLiteral_0= 'a' ) | (enumLiteral_1= 'b' ) ) )
            // InternalMyDsl.g:871:2: ( (enumLiteral_0= 'a' ) | (enumLiteral_1= 'b' ) )
            {
            // InternalMyDsl.g:871:2: ( (enumLiteral_0= 'a' ) | (enumLiteral_1= 'b' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            else if ( (LA6_0==21) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:872:3: (enumLiteral_0= 'a' )
                    {
                    // InternalMyDsl.g:872:3: (enumLiteral_0= 'a' )
                    // InternalMyDsl.g:873:4: enumLiteral_0= 'a'
                    {
                    enumLiteral_0=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getRegisterAccess().getRegisterAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRegisterAccess().getRegisterAEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:880:3: (enumLiteral_1= 'b' )
                    {
                    // InternalMyDsl.g:880:3: (enumLiteral_1= 'b' )
                    // InternalMyDsl.g:881:4: enumLiteral_1= 'b'
                    {
                    enumLiteral_1=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getRegisterAccess().getRegisterBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRegisterAccess().getRegisterBEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRegister"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000220000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000620000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000220020L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000220000L});

}
