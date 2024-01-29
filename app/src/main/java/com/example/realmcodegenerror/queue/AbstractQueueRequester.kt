package com.example.realmcodegenerror.queue

import io.realm.kotlin.Realm
import io.realm.kotlin.types.RealmObject
import kotlin.reflect.KClass

abstract class AbstractQueueRequester<Q, in Response>(
    protected val realm: Realm,
    protected val clazz: KClass<Q>,
    private val listener: Listener,
    val isItUploading: Boolean
) where Q : RealmObject, Q : QueueRealmObject {
    interface Listener {}
}