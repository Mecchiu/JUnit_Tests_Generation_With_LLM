/*
 * Copyright (C) 2010-2011 VTT Technical Research Centre of Finland.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation;
 * version 2.1 of the License.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */

package fi.vtt.noen.mfw.bundle.server.plugins.webui.derivedmeasurepage;

import fi.vtt.noen.mfw.bundle.common.Logger;
import fi.vtt.noen.mfw.bundle.server.shared.datamodel.DMValue;
import org.apache.wicket.extensions.markup.html.repeater.util.SortParam;
import org.apache.wicket.extensions.markup.html.repeater.util.SortableDataProvider;
import org.apache.wicket.model.IModel;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author Teemu Kanstren
 */
public class DMValueListDataProvider extends SortableDataProvider<DMValue> {
  private final static Logger log = new Logger(DMValueListDataProvider.class);
  private final List<DMValue> dmValues;

  public DMValueListDataProvider(List<DMValue> dmValues) {
    this.dmValues = dmValues;
    setSort("name", true);
  }

  public Iterator<DMValue> iterator(int i, int i1) {
    SortParam sp = getSort();
    String key = sp.getProperty();
    log.debug("sort key:" + key);
    if (sp.isAscending()) {
      Collections.sort(dmValues, new DMValueComparator(key, true));
    } else {
      Collections.sort(dmValues, new DMValueComparator(key, false));
    }
    return dmValues.subList(i, i + i1).iterator();
  }

  public int size() {
    return dmValues.size();
  }

  public IModel<DMValue> model(DMValue dm) {
    return new DetachableDMValueModel(dm);
  }
}
