package org.character.data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.character.data.config.CharConfig;
import org.javathena.core.data.Friend;
import org.javathena.core.data.Hotkey;
import org.javathena.core.data.IndexedFastMap;
import org.javathena.core.data.Item;
import org.javathena.core.data.PersistenteData;
import org.javathena.core.data.Point;
import org.javathena.core.data.ROCharacter;
import org.javathena.core.data.Skill;
import org.javathena.core.data.ROCharacter.JOB;
import org.javathena.core.utiles.Functions;

public class TXTCharacter implements PersistenteData<IndexedFastMap<Integer, ROCharacter>> {

    /**
     * Load character under the last format version only version 1500 (homun +
     * mapindex maps)
     *
     * @return indexedChar a fastmap containing loaded characters
     * @throws MalformedDataException
     */
    @Override
    public IndexedFastMap<Integer, ROCharacter> load() throws IOException;
}
