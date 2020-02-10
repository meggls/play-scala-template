package xyz.meggls.template.util

import com.typesafe.scalalogging.Logger

trait LogUtil {
    implicit protected val log: Logger = Logger(this.getClass)
}
