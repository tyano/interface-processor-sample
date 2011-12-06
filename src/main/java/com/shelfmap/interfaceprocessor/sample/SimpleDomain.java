/*
 * Copyright 2011 Tsutomu YANO.
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
package com.shelfmap.interfaceprocessor.sample;

import com.shelfmap.interfaceprocessor.RetainType;
import com.shelfmap.interfaceprocessor.annotation.GenerateClass;
import com.shelfmap.interfaceprocessor.annotation.Property;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Tsutomu YANO
 */
@GenerateClass(superClass=SimpleSuperClass.class)
public interface SimpleDomain extends SuperInterface {
    String getName();
    void setName(String name);

    int getAge();
    
    boolean isMale();
    void setMale(boolean male);
    
    float getCoefficient();
    void setCoefficient(float value);
    
    @Property(retainType= RetainType.NEW, realType=ArrayList.class)
    Collection<? extends Number> getCollection();
    void setCollection(Collection<? extends Number> collection);
}
