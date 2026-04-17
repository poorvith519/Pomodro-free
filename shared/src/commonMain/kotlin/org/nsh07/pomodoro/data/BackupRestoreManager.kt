/*
 * Copyright (c) 2026 Nishant Mishra
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

package org.nsh07.pomodoro.data

/**
 * Class to handle platform-specific filesystem abstraction (e.g. Uri on Android). An empty
 * constructor is provided to initialize a null instance.
 */
expect class FileLocator {
    /**
     * Initialize a [org.nsh07.pomodoro.data.FileLocator] with a null instance of whichever
     * filesystem abstraction is being used
     */
    constructor()

    /**
     * File/directory path as string
     */
    val path: String?
    val isNull: Boolean
}

interface BackupRestoreManager {
    suspend fun performBackup(directoryLocator: FileLocator)
    suspend fun performRestore(fileLocator: FileLocator)

    fun restartApp()
}