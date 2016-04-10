/*
 * Copyright 2016 Sam Sun <me@samczsun.com>
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.samczsun.helios;

import java.io.File;
import java.util.function.Supplier;

public class Constants {
    public static final String REPO_NAME = "Helios";
    public static final String REPO_VERSION = "0.0.2" + (System.getProperty("com.heliosdecompiler.buildNumber") != null ? " (Build " + System.getProperty("com.heliosdecompiler.buildNumber") : "");
    public static final String REPO_BASE = "https://github.com/samczsun/" + REPO_NAME + "/";
    public static final String RAW_REPO_BASE = "https://raw.github.com/samczsun/" + REPO_NAME + "/";

    public static final String CHANGELOG_FILE = RAW_REPO_BASE + "master/CHANGELOG";

    public static final String SWT_VERSION = "4.5.1";
    public static final String KRAKATAU_VERSION = "a000009e6fea1af91917cda4721462b5238cb561";
    public static final String ENJARIFY_VERSION = "ad8d64f6e564922bbe1f08f488cf7f51c961422d";

    public static final int MB = 1024 * 1024;
    public static final File DATA_DIR = new File(
            System.getProperty("user.home") + File.separator + "." + Constants.REPO_NAME.toLowerCase());
    public static final File KRAKATAU_DIR = new File(DATA_DIR,
            "krakatau" + File.separator + Constants.KRAKATAU_VERSION);
    public static final File ENJARIFY_DIR = new File(DATA_DIR,
            "enjarify" + File.separator + Constants.ENJARIFY_VERSION);
    public static final File ADDONS_DIR = new File(DATA_DIR, "addons");
    public static final File SETTINGS_FILE = new File(DATA_DIR, "settings.json");
    public static final String NEWLINE = System.lineSeparator();
    private static final Runtime RUNTIME = Runtime.getRuntime();
    public static final Supplier<Integer> USED_MEMORY = () -> (int) ((RUNTIME.totalMemory() - RUNTIME.freeMemory()) / MB);
    public static final Supplier<Integer> TOTAL_MEMORY = () -> (int) (RUNTIME.maxMemory() / MB);
}
