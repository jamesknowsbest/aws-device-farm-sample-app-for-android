/*
 * Copyright 2014-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.devicefarm.android.referenceapp.Categories.Inputs;

import android.support.test.espresso.contrib.PickerActions;

import com.amazonaws.devicefarm.android.referenceapp.R;

import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Tests for a date picker
 */
public class DatePickerTest extends InputControlsBase {
    @Override
    protected int getPageIndex() {
        return 7;
    }

    @Override
    public void testSanity() {
        checkIfIdDisplayed(R.id.input_datepicker);
        checkIfIdDisplayed(R.id.input_date_display);
    }

    /**
     * Tests a date picker by inputting a date in the date picker then validating
     * if the date is displayed.
     */
    @Test
    public void testDatePicker(){
        onView(withId(R.id.input_datepicker)).perform(PickerActions.setDate(2015, 10, 27));
        checkIfIdIsDisplayedWithText(R.id.input_date_display, "10/27/2015");
    }
}
