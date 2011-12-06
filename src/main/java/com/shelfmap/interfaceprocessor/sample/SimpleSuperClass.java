/*
 * Copyright 2011 Tsutomu YANO.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.shelfmap.interfaceprocessor.sample;

/**
 *
 * @author Tsutomu YANO
 */
public class SimpleSuperClass {
    private int test;
    private OtherInterface test2;
    private OtherInterface test3;
    private String test4;
    private float test5;
    private double test6;
    private long test7;
    private short test8;
    private boolean test9;

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SimpleSuperClass other = (SimpleSuperClass) obj;
        if (this.test != other.test) {
            return false;
        }
        if (this.test2 != other.test2 && (this.test2 == null || !this.test2.equals(other.test2))) {
            return false;
        }
        if (this.test3 != other.test3 && (this.test3 == null || !this.test3.equals(other.test3))) {
            return false;
        }
        if ((this.test4 == null) ? (other.test4 != null) : !this.test4.equals(other.test4)) {
            return false;
        }
        if (Float.floatToIntBits(this.test5) != Float.floatToIntBits(other.test5)) {
            return false;
        }
        if (Double.doubleToLongBits(this.test6) != Double.doubleToLongBits(other.test6)) {
            return false;
        }
        if (this.test7 != other.test7) {
            return false;
        }
        if (this.test8 != other.test8) {
            return false;
        }
        if (this.test9 != other.test9) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + this.test;
        result = 31 * result + (this.test2 != null ? this.test2.hashCode() : 0);
        result = 31 * result + (this.test3 != null ? this.test3.hashCode() : 0);
        result = 31 * result + (this.test4 != null ? this.test4.hashCode() : 0);
        result = 31 * result + Float.floatToIntBits(this.test5);
        result = 31 * result + (int) (Double.doubleToLongBits(this.test6) ^ (Double.doubleToLongBits(this.test6) >>> 32));
        result = 31 * result + (int) (this.test7 ^ (this.test7 >>> 32));
        result = 31 * result + this.test8;
        result = 31 * result + (this.test9 ? 1 : 0);
        return result;
    }
}
