/*
 * Copyright 2016 MovingBlocks
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
package org.terasology.structureTemplates.internal.systems;

import org.terasology.entitySystem.Component;
import org.terasology.math.Region3i;
import org.terasology.math.geom.Vector3i;
import org.terasology.network.FieldReplicateType;
import org.terasology.network.Replicate;

/**
 * Used to describe an block region location
 */
public class StructureTemplateEditorComponent implements Component {
    /**
     * Edit region relative to origin.
     */
    @Replicate(FieldReplicateType.OWNER_TO_SERVER)
    public Region3i editRegion = Region3i.createBounded(new Vector3i(0,0,0), new Vector3i(0,0,0));

    /**
     * Origin for editRegion values. To get the avsolute edit region add this value to it.
     */
    @Replicate(FieldReplicateType.OWNER_TO_SERVER)
    public Vector3i origin = new Vector3i();
}
