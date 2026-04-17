/*
 * Copyright (c) 2025-2026 Nishant Mishra
 *
 * This file is part of Pomodoro - a minimalist pomodoro timer for Android.
 *
 * Pomodoro is free software: you can redistribute it and/or modify it under the terms of the GNU
 * General Public License as published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * Pomodoro is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even
 * the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General
 * Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with Pomodoro.
 * If not, see <https://www.gnu.org/licenses/>.
 */

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.kotlin.multiplatform.library) apply false
    alias(libs.plugins.compose.multiplatform) apply false
    alias(libs.plugins.compose.compiler) apply false
    alias(libs.plugins.kotlin.serialization) apply false
    alias(libs.plugins.ksp) apply false
    alias(libs.plugins.android.test) apply false
    alias(libs.plugins.kotlin.multiplatform) apply false
    alias(libs.plugins.koin.compiler) apply false
}