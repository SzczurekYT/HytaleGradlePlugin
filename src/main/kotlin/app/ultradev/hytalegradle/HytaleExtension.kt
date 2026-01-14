package app.ultradev.hytalegradle

import org.gradle.api.file.DirectoryProperty
import org.gradle.api.model.ObjectFactory
import javax.inject.Inject

abstract class HytaleExtension @Inject constructor(objects: ObjectFactory) {
    /** Base directory of the Hytale "latest" install (contains Server/ and Assets.zip) */
    abstract val basePath: DirectoryProperty
}
