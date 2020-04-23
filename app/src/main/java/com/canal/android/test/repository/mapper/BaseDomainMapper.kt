package com.canal.android.test.repository.mapper

abstract class BaseDomainMapper<API, DOMAIN> {

    abstract fun toDomain(api: API): DOMAIN
}