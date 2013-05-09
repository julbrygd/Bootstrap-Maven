/*
 * Copyright 2013 Stephan Conrad <stephan.conrad@gmail.com>.
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
package com.github.julbrygd.twitter.bootstrap.menu;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Stephan Conrad <stephan.conrad@gmail.com>
 */
public class Menu implements MenuInterface{
    
    protected List<MenuItemInterface> items;

    public Menu() {
        this.items = new ArrayList<MenuItemInterface>();
    }

    public void addMenuItem(MenuItemInterface item) {
        this.items.add(item);
    }
    
    

    public List<MenuItemInterface> getMenuItems() {
        return this.items;
    }
    
}
