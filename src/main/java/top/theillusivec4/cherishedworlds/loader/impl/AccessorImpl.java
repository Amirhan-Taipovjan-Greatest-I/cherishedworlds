/*
 * Copyright (c) 2018-2020 C4
 *
 * This file is part of Cherished Worlds, a mod made for Minecraft.
 *
 * Cherished Worlds is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Cherished Worlds is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with Cherished Worlds.  If not, see <https://www.gnu.org/licenses/>.
 */

package top.theillusivec4.cherishedworlds.loader.impl;

import net.minecraft.client.gui.screen.world.SelectWorldScreen;
import net.minecraft.client.gui.screen.world.WorldListWidget;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.world.level.storage.LevelSummary;
import top.theillusivec4.cherishedworlds.core.Accessor;
import top.theillusivec4.cherishedworlds.loader.mixin.SelectWorldScreenAccessor;
import top.theillusivec4.cherishedworlds.loader.mixin.WorldListEntryAccessor;
import top.theillusivec4.cherishedworlds.loader.mixin.EntryListWidgetAccessor;

public class AccessorImpl implements Accessor {

  @Override
  public WorldListWidget getWorldList(SelectWorldScreen screen) {
    return ((SelectWorldScreenAccessor) screen).getLevelList();
  }

  @SuppressWarnings("ConstantConditions")
  @Override
  public LevelSummary getWorldSummary(WorldListWidget.Entry entry) {
    return ((WorldListEntryAccessor) (Object) entry).getLevel();
  }

  @Override
  public ButtonWidget getDeleteButton(SelectWorldScreen screen) {
    return ((SelectWorldScreenAccessor) screen).getDeleteButton();
  }

  @Override
  public TextFieldWidget getTextField(SelectWorldScreen screen) {
    return ((SelectWorldScreenAccessor) screen).getSearchBox();
  }

  @Override
  public int getTop(WorldListWidget worldList) {
    return ((EntryListWidgetAccessor) worldList).getTop();
  }

  @Override
  public int getBottom(WorldListWidget worldList) {
    return ((EntryListWidgetAccessor) worldList).getBottom();
  }
}
