package ru.delimobil.cabbit.algebra

import cats.effect.Resource
import com.rabbitmq.client

trait ConnectionFactory[F[_]] {

  def newConnection(
      addresses: List[client.Address],
      appName: Option[String] = None
  ): Resource[F, Connection[F]]
}
