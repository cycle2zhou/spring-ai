/*
 * Copyright 2023-2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.ai.vectorstore;

/**
 * The {@code HanaCloudVectorStoreConfig} class represents the configuration for the
 * HanaCloudVectorStore. It provides methods to retrieve the table name and the topK
 * value.
 *
 * @author Rahul Mittal
 * @since 1.0.0
 */
public final class HanaCloudVectorStoreConfig {

	private String tableName;

	private int topK;

	private HanaCloudVectorStoreConfig() {
	}

	public static HanaCloudVectorStoreConfigBuilder builder() {
		return new HanaCloudVectorStoreConfigBuilder();
	}

	public String getTableName() {
		return this.tableName;
	}

	public int getTopK() {
		return this.topK;
	}

	public static class HanaCloudVectorStoreConfigBuilder {

		private String tableName;

		private int topK;

		public HanaCloudVectorStoreConfigBuilder tableName(String tableName) {
			this.tableName = tableName;
			return this;
		}

		public HanaCloudVectorStoreConfigBuilder topK(int topK) {
			this.topK = topK;
			return this;
		}

		public HanaCloudVectorStoreConfig build() {
			HanaCloudVectorStoreConfig config = new HanaCloudVectorStoreConfig();
			config.tableName = this.tableName;
			config.topK = this.topK;
			return config;
		}

	}

}
