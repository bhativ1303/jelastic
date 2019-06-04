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
package io.github.jelastic.models.query.paged;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Min;

/**
 * Created by koushikr
 */
@Data
@Builder
public class PageWindow {

    @Min(0)
    @Builder.Default
    private int pageNumber = 0;

    @Min(0)
    @Builder.Default
    private int pageSize = 10;
}
