/*

   Copyright 2018-2023 Charles Korn.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       https://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

*/

package com.charleskorn.kaml

import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.StringFormat
import kotlinx.serialization.modules.EmptySerializersModule
import kotlinx.serialization.modules.SerializersModule

public expect class Yaml(
    serializersModule: SerializersModule = EmptySerializersModule(),
    configuration: YamlConfiguration = YamlConfiguration(),
) : StringFormat {
    public val configuration: YamlConfiguration

    public fun <T> decodeFromYamlNode(deserializer: DeserializationStrategy<T>, node: YamlNode): T

    public companion object {
        public val default: Yaml
    }
}
