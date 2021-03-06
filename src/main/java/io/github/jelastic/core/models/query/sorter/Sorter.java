/*
 * Copyright 2019 Koushik R <rkoushik.14@gmail.com>.
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
package io.github.jelastic.core.models.query.sorter;

import com.google.common.collect.ComparisonChain;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Min;

/**
 * Created by koushikr
 * @deprecated as of 7.2.0-5, replaced by {@link JElasticSorter}
 */
@Data
@Builder
@Deprecated
public class Sorter implements Comparable<Sorter> {

    @Min(1)
    public int priority;

    @NonNull
    @NotEmpty
    private String fieldName;

    private SortOrder sortOrder;

    @Override
    public int compareTo(Sorter o) {
        return ComparisonChain.start()
                .compare(priority, o.getPriority())
                .result();
    }
}
