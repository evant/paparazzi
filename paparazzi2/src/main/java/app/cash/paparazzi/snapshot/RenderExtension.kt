/*
 * Copyright (C) 2021 Square, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package app.cash.paparazzi.snapshot

import android.view.View

/**
 * An extension for overlaying additional information on top of each rendered frame.
 */
public interface RenderExtension {
  /**
   * Allows this extension to modify the view hierarchy represented by [contentView].
   *
   * Returns the root view of the modified hierarchy.
   */
  public fun renderView(contentView: View): View
}
