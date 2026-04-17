/*
 * Copyright (c) 2025 Nishant Mishra
 *
 * This file is part of Pomodoro - a minimalist pomodoro timer for Android.
 *
 * Pomodoro is free software: you can redistribute it and/or modify it under the terms of the GNU
 * General Public License as published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 */

package org.nsh07.pomodoro.billing

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

/**
 * Google Play implementation of BillingManager - all features are free
 */
class PlayBillingManager : BillingManager {
    override val isPlus = MutableStateFlow(true).asStateFlow()
}
