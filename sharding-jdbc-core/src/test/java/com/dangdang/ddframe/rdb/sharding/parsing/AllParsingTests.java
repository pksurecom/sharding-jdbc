/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
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
 * </p>
 */

package com.dangdang.ddframe.rdb.sharding.parsing;

import com.dangdang.ddframe.rdb.sharding.parsing.lexer.analyzer.TokenizerTest;
import com.dangdang.ddframe.rdb.sharding.parsing.mysql.MySQLPreparedStatementForOneParameterTest;
import com.dangdang.ddframe.rdb.sharding.parsing.mysql.MySQLPreparedStatementForTowParametersTest;
import com.dangdang.ddframe.rdb.sharding.parsing.mysql.MySQLStatementTest;
import com.dangdang.ddframe.rdb.sharding.parsing.mysql.OrParseTest;
import com.dangdang.ddframe.rdb.sharding.parsing.lexer.dialect.mysql.MySQLLexerTest;
import com.dangdang.ddframe.rdb.sharding.parsing.lexer.dialect.oracle.OracleLexerTest;
import com.dangdang.ddframe.rdb.sharding.parsing.lexer.dialect.postgresql.PostgreSQLLexerTest;
import com.dangdang.ddframe.rdb.sharding.parsing.lexer.dialect.sqlserver.SQLServerLexerTest;
import com.dangdang.ddframe.rdb.sharding.parsing.lexer.LexerTest;
import com.dangdang.ddframe.rdb.sharding.parsing.parser.type.DeleteStatementParserTest;
import com.dangdang.ddframe.rdb.sharding.parsing.parser.type.InsertStatementParserTest;
import com.dangdang.ddframe.rdb.sharding.parsing.parser.type.UpdateStatementParserTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TokenizerTest.class,
        LexerTest.class,
        MySQLLexerTest.class,
        OracleLexerTest.class,
        SQLServerLexerTest.class,
        PostgreSQLLexerTest.class,
        InsertStatementParserTest.class,
        UpdateStatementParserTest.class,
        DeleteStatementParserTest.class,
        MySQLStatementTest.class,
        SQLParsingEngineTest.class,
        MySQLPreparedStatementForOneParameterTest.class, 
        MySQLPreparedStatementForTowParametersTest.class,  
        OrParseTest.class,
        UnsupportedParseTest.class
    })
public class AllParsingTests {
}