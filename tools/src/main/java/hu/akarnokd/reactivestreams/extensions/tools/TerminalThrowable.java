/*
 * Copyright 2017 David Karnok
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package hu.akarnokd.reactivestreams.extensions.tools;

/**
 * A stackless Throwable that is used for indicating a terminal state within
 * an atomic Throwable error container (field or AtomicReference).
 */
final class TerminalThrowable extends Throwable {

    private static final long serialVersionUID = -1563001250224932688L;

    TerminalThrowable() {
        super("Sequence already terminated. This Throwable should not be emitted via onError!");
    }

    @Override
    public Throwable fillInStackTrace() {
        return this;
    }
}
