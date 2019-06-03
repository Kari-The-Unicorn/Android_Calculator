/*
 * Copyright 2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gradle.api.internal.file;

import org.gradle.api.tasks.util.PatternSet;
import org.gradle.api.tasks.util.internal.PatternSets;
import org.gradle.internal.Factory;

import java.io.File;

/**
 * FileResolver that uses the file provided to it or constructs one from the toString of the provided object. Used in cases where a FileResolver is needed by the infrastructure, but no base directory
 * can be known.
 */
public class IdentityFileResolver extends AbstractFileResolver {
    public IdentityFileResolver() {
        this(PatternSets.getNonCachingPatternSetFactory());
    }

    public IdentityFileResolver(Factory<PatternSet> patternSetFactory) {
        super(patternSetFactory);
    }

    @Override
    protected File doResolve(Object path) {
        File file = convertObjectToFile(path);

        if (file == null) {
            throw new IllegalArgumentException(String.format(
                "Cannot convert path to File. path='%s'", path));
        }

        if (!file.isAbsolute()) {
            throw new UnsupportedOperationException(String.format("Cannot convert relative path %s to an absolute file.", path));
        }
        return file;
    }

    public String resolveAsRelativePath(Object path) {
        throw new UnsupportedOperationException(String.format("Cannot convert path %s to a relative path.", path));
    }

    @Override
    public boolean canResolveRelativePath() {
        return false;
    }
}
