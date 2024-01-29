package com.example.realmcodegenerror.queue

import android.content.Context
import io.realm.kotlin.Realm
import io.realm.kotlin.types.RealmObject
import kotlin.reflect.KClass

abstract class FileUploadQueueRequester<QueueObject, MediaObject, R>(
    realm: Realm,
    protected var mobile2Service: Mobile2Service,
    protected var context: Context,
    clazz: KClass<QueueObject>,
    private val mediaClazz: KClass<MediaObject>,
    listener: Listener
) : AbstractQueueRequester<QueueObject, R>(
    realm, clazz, listener, true
) where QueueObject : RealmObject,
        QueueObject : QueueRealmObject,
        QueueObject : FileUploadQueueObject,
        MediaObject : RealmObject,
        MediaObject : AbstractMedia {

        }

