package org.julia.lang.parser;

import org.antlr.v4.runtime.*;

public class ErrorStrategy extends BailErrorStrategy {


  @Override
  public void reportError(Parser recognizer, RecognitionException e) {
    super.reportError(recognizer, e);
    System.out.println("e = " + e);
  }

  @Override
  protected void reportNoViableAlternative(Parser recognizer, NoViableAltException e) {
    super.reportNoViableAlternative(recognizer, e);
    System.out.println("e = " + e);
  }

  @Override
  protected void reportInputMismatch(Parser recognizer, InputMismatchException e) {
    super.reportInputMismatch(recognizer, e);
    System.out.println("e = " + e);
  }

  @Override
  protected void reportFailedPredicate(Parser recognizer, FailedPredicateException e) {
    super.reportFailedPredicate(recognizer, e);
    System.out.println("e = " + e);
  }

  @Override
  protected void reportUnwantedToken(Parser recognizer) {
    super.reportUnwantedToken(recognizer);
  }

  @Override
  protected void reportMissingToken(Parser recognizer) {
    super.reportMissingToken(recognizer);
  }
}
