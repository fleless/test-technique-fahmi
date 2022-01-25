package com.canal.android.test.data.mapper

abstract class BaseDomainMapper<API, DOMAIN> {

    abstract fun toDomain(api: API): DOMAIN
}