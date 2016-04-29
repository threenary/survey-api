package com.threenary.builders;

import java.util.List;

import javax.annotation.Generated;

import com.threenary.domain.Survey;
import com.threenary.domain.SurveyResult;

@Generated("PojoBuilder")
public class SurveyBuilder
    implements Cloneable {
  protected SurveyBuilder self;
  protected long value$id$long;
  protected boolean isSet$id$long;
  protected String value$name$java$lang$String;
  protected boolean isSet$name$java$lang$String;
  protected List<SurveyResult> value$results$java$util$List;
  protected boolean isSet$results$java$util$List;

  /**
   * Creates a new {@link SurveyBuilder}.
   */
  public SurveyBuilder() {
    self = (SurveyBuilder)this;
  }

  /**
   * Sets the default value for the {@link Survey#id} property.
   *
   * @param value the default value
   * @return this builder
   */
  public SurveyBuilder withId(long value) {
    this.value$id$long = value;
    this.isSet$id$long = true;
    return self;
  }

  /**
   * Sets the default value for the {@link Survey#name} property.
   *
   * @param value the default value
   * @return this builder
   */
  public SurveyBuilder withName(String value) {
    this.value$name$java$lang$String = value;
    this.isSet$name$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link Survey#results} property.
   *
   * @param value the default value
   * @return this builder
   */
  public SurveyBuilder withResults(List<SurveyResult> value) {
    this.value$results$java$util$List = value;
    this.isSet$results$java$util$List = true;
    return self;
  }

  /**
   * Returns a clone of this builder.
   *
   * @return the clone
   */
  @Override
  public Object clone() {
    try {
      SurveyBuilder result = (SurveyBuilder)super.clone();
      result.self = result;
      return result;
    } catch (CloneNotSupportedException e) {
      throw new InternalError(e.getMessage());
    }
  }

  /**
   * Returns a clone of this builder.
   *
   * @return the clone
   */
  public SurveyBuilder but() {
    return (SurveyBuilder)clone();
  }

  /**
   * Creates a new {@link Survey} based on this builder's settings.
   *
   * @return the created Survey
   */
  public Survey build() {
    try {
      Survey result = new Survey();
      if (isSet$id$long) {
        result.setId(value$id$long);
      }
      if (isSet$name$java$lang$String) {
        result.setName(value$name$java$lang$String);
      }
      if (isSet$results$java$util$List) {
        result.setResults(value$results$java$util$List);
      }
      return result;
    } catch (RuntimeException ex) {
      throw ex;
    } catch (Exception ex) {
      throw new java.lang.reflect.UndeclaredThrowableException(ex);
    }
  }
}
