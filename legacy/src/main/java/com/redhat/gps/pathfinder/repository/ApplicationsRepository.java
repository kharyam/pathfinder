package com.redhat.gps.pathfinder.repository;

/*-
 * #%L
 * Pathfinder
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2018 RedHat
 * %%
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
 * #L%
 */

import com.redhat.gps.pathfinder.domain.Applications;
import org.springframework.stereotype.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Spring Data MongoDB repository for the Applications entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ApplicationsRepository extends MongoRepository<Applications, String> {

    @Override
    List<Applications> findAll();

    @Override
    Applications  insert(Applications entity);

    @Override
    Applications save(Applications entity);

    @Override
    boolean exists(String s);

    @Override
    long count();
}
