package com.threenary.builders;

import javax.annotation.Generated;

import com.threenary.domain.SurveyResult;

@Generated("PojoBuilder")
public class SurveyResultBuilder
    implements Cloneable {
  protected SurveyResultBuilder self;
  protected long value$id$long;
  protected boolean isSet$id$long;
  protected String value$name$java$lang$String;
  protected boolean isSet$name$java$lang$String;
  protected long value$value$long;
  protected boolean isSet$value$long;

  /**
   * Creates a new {@link SurveyResultBuilder}.
   */
  public SurveyResultBuilder() {
    self = (SurveyResultBuilder)this;
  }

  /**
   * Sets the default value for the {@link SurveyResult#id} property.
   *
   * @param value the default value
   * @return this builder
   */
  public SurveyResultBuilder withId(long value) {
    this.value$id$long = value;
    this.isSet$id$long = true;
    return self;
  }

  /**
   * Sets the default value for the {@link SurveyResult#name} property.
   *
   * @param value the default value
   * @return this builder
   */
  public SurveyResultBuilder withName(String value) {
    this.value$name$java$lang$String = value;
    this.isSet$name$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link SurveyResult#value} property.
   *
   * @param value the default value
   * @return this builder
   */
  public SurveyResultBuilder withValue(long value) {
    this.value$value$long = value;
    this.isSet$value$long = true;
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
      SurveyResultBuilder result = (SurveyResultBuilder)super.clone();
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
  public SurveyResultBuilder but() {
    return (SurveyResultBuilder)clone();
  }

  /**
   * Creates a new {@link SurveyResult} based on this builder's settings.
   *
   * @return the created SurveyResult
   */
  public SurveyResult build() {
    try {
      SurveyResult result = new SurveyResult();
      if (isSet$id$long) {
        result.setId(value$id$long);
      }
      if (isSet$name$java$lang$String) {
        result.setName(value$name$java$lang$String);
      }
      if (isSet$value$long) {
        result.setValue(value$value$long);
      }
      return result;
    } catch (RuntimeException ex) {
      throw ex;
    } catch (Exception ex) {
      throw new java.lang.reflect.UndeclaredThrowableException(ex);
    }
  }
}
