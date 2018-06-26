/*
 * Copyright 2010-2017 JetBrains s.r.o.
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

package org.jetbrains.kotlin.cfg;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/cfg-constant-propagation")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class ConstantPropagationTestGenerated extends AbstractConstantPropagationTest {
    public void testAllFilesPresentInCfg_constant_propagation() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/cfg-constant-propagation"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("compiler/testData/cfg-constant-propagation/basic")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Basic extends AbstractConstantPropagationTest {
        public void testAllFilesPresentInBasic() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/cfg-constant-propagation/basic"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("BasicOperations.kt")
        public void testBasicOperations() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cfg-constant-propagation/basic/BasicOperations.kt");
            doTest(fileName);
        }

        @TestMetadata("Branching.kt")
        public void testBranching() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cfg-constant-propagation/basic/Branching.kt");
            doTest(fileName);
        }

        @TestMetadata("SimpleInitialization.kt")
        public void testSimpleInitialization() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cfg-constant-propagation/basic/SimpleInitialization.kt");
            doTest(fileName);
        }

        @TestMetadata("TrivialVals.kt")
        public void testTrivialVals() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cfg-constant-propagation/basic/TrivialVals.kt");
            doTest(fileName);
        }

        @TestMetadata("TrivialVals_1.kt")
        public void testTrivialVals_1() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cfg-constant-propagation/basic/TrivialVals_1.kt");
            doTest(fileName);
        }

        @TestMetadata("When.kt")
        public void testWhen() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cfg-constant-propagation/basic/When.kt");
            doTest(fileName);
        }

        @TestMetadata("WhenExElse.kt")
        public void testWhenExElse() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/cfg-constant-propagation/basic/WhenExElse.kt");
            doTest(fileName);
        }
    }
}