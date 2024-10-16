/*
 * MapResourcesBunble.java
 *
 *  Copyright 2010 Yann D'Isanto.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */

package com.mytdev.resources4j.impl;

import com.mytdev.resources4j.interfaces.Resources;
import com.mytdev.resources4j.interfaces.ResourcesBundle;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * A Simple Map based ResourcesBundle.
 * @author Yann D'Isanto
 */
public class MapResourcesBunble implements ResourcesBundle {

    private Map<Locale, Resources> bundle;

    public MapResourcesBunble(Map<Locale, Resources> bundle) {
        this.bundle = new HashMap<Locale, Resources>(bundle);
    }

    @Override
    public Resources getResources() {
        return getResources(Locale.getDefault());
    }

    @Override
    public Resources getResources(Locale locale) {
        Resources resources = bundle.get(locale);
        if (resources == null) {
            if(! "".equals(locale.getCountry())) {
                resources = bundle.get(new Locale(locale.getLanguage()));
            }
            if (resources == null) {
                resources = bundle.get(Locale.ROOT);
            }
        }
        return resources;
    }
}
