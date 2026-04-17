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

import androidx.compose.runtime.Composable

// All features are free - paywall dialog is a no-op
@Composable
fun PomodoroPlusPaywallDialog(
    isPlus: Boolean,
    onDismiss: () -> Unit
) {
    // No paywall shown - all features are unlocked
}
