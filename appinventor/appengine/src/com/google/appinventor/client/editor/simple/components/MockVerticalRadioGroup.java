// -*- mode: java; c-basic-offset: 2; -*-
// Copyright 2009-2011 Google, All Rights reserved
// Copyright 2021 MIT, All rights reserved
// Released under the Apache License, Version 2.0
// http://www.apache.org/licenses/LICENSE-2.0

package com.google.appinventor.client.editor.simple.components;

import com.google.appinventor.client.editor.simple.SimpleEditor;
import com.google.appinventor.components.common.ComponentConstants;

/**
 * Mock VerticalRadioGroup component.
 *
 * @author thamihardik8@gmail.com (Hardik Thami)
 */
public final class MockVerticalRadioGroup extends MockRadioGroup {

  /**
   * Component type name.
   */
  public static final String TYPE = "VerticalRadioGroup";

  /**
   * Creates a new MockVerticalRadioGroup component.
   *
   * @param editor  editor of source file the component belongs to
   */
  public MockVerticalRadioGroup(SimpleEditor editor) {
    super(editor, TYPE, images.radioGroup(),
      ComponentConstants.LAYOUT_ORIENTATION_VERTICAL,
      ComponentConstants.SCROLLABLE_ARRANGEMENT);
  }

}