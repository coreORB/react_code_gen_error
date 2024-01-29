package com.example.realmcodegenerror.queue

import android.content.Context
import io.realm.kotlin.Realm

class OrderMediaAddRequester(
    realm: Realm,
    mobile2Service: Mobile2Service,
    context: Context,
    listener: Listener
) : FileUploadQueueRequester<OrderMediaAddQro, OrderMediaRealmObject, ResponseEnvelope<ArrayList<Void>>>(
    realm,
    mobile2Service,
    context,
    OrderMediaAddQro::class,
    OrderMediaRealmObject::class,
    listener
) {
    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }

    override fun toString(): String {
        return super.toString()
    }
}