/*
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package dk.statsbiblioteket.summa.common.solr.analysis;

import org.apache.lucene.analysis.util.CharFilterFactory;
import org.apache.lucene.util.Version;

import java.io.Reader;

/**
 * Trivial factory for {@link LowerCaseCharFilter}.
 */
public class LowerCaseCharFilterFactory extends CharFilterFactory {

    @Override
    public Reader create(Reader input) {
        return new LowerCaseCharFilter(Version.LUCENE_40, input);
    }
}
