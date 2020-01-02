package com.streamxhub.flink.test

object LogoTestApp {

  def main(args: Array[String]): Unit = {
    val appName = "Flink Job Starting..."
    val logo =
      s"""
         |
         |                         ▒▓██▓██▒
         |                     ▓████▒▒█▓▒▓███▓▒
         |                  ▓███▓░░        ▒▒▒▓██▒  ▒
         |                ░██▒   ▒▒▓▓█▓▓▒░      ▒████
         |                ██▒         ░▒▓███▒    ▒█▒█▒
         |                  ░▓█            ███   ▓░▒██
         |                    ▓█       ▒▒▒▒▒▓██▓░▒░▓▓█
         |                  █░ █   ▒▒░       ███▓▓█ ▒█▒▒▒
         |                  ████░   ▒▓█▓      ██▒▒▒ ▓███▒
         |               ░▒█▓▓██       ▓█▒    ▓█▒▓██▓ ░█░
         |         ▓░▒▓████▒ ██         ▒█    █▓░▒█▒░▒█▒
         |        ███▓░██▓  ▓█           █   █▓ ▒▓█▓▓█▒
         |      ░██▓  ░█░            █  █▒ ▒█████▓▒ ██▓░▒
         |     ███░ ░ █░          ▓ ░█ █████▒░░    ░█░▓  ▓░
         |    ██▓█ ▒▒▓▒          ▓███████▓░       ▒█▒ ▒▓ ▓██▓
         | ▒██▓ ▓█ █▓█       ░▒█████▓▓▒░         ██▒▒  █ ▒  ▓█▒
         | ▓█▓  ▓█ ██▓ ░▓▓▓▓▓▓▓▒              ▒██▓           ░█▒
         | ▓█    █ ▓███▓▒░              ░▓▓▓███▓          ░▒░ ▓█
         | ██▓    ██▒    ░▒▓▓███▓▓▓▓▓██████▓▒            ▓███  █
         |▓███▒ ███   ░▓▓▒░░   ░▓████▓░                  ░▒▓▒  █▓
         |█▓▒▒▓▓██  ░▒▒░░░▒▒▒▒▓██▓░                            █▓
         |██ ▓░▒█   ▓▓▓▓▒░░  ▒█▓       ▒▓▓██▓    ▓▒          ▒▒▓
         |▓█▓ ▓▒█  █▓░  ░▒▓▓██▒            ░▓█▒   ▒▒▒░▒▒▓█████▒
         | ██░ ▓█▒█▒  ▒▓▓▒  ▓█                █░      ░░░░   ░█▒
         | ▓█   ▒█▓   ░     █░                ▒█              █▓
         |  █▓   ██         █░                 ▓▓        ▒█▓▓▓▒█░
         |   █▓ ░▓██░       ▓▒                  ▓█▓▒░░░▒▓█░    ▒█
         |    ██   ▓█▓░      ▒                    ░▒█▒██▒      ▓▓
         |     ▓█▒   ▒█▓▒░                         ▒▒ █▒█▓▒▒░░▒██
         |      ░██▒    ▒▓▓▒                     ▓██▓▒█▒ ░▓▓▓▓▒█▓
         |        ░▓██▒                          ▓░  ▒█▓█  ░░▒▒▒
         |            ▒▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▓▓  ▓░▒█░
         |
         |$appName Starting...
         |
         |""".stripMargin

    println(s"\033[31;4m${logo}\033[0m")

  }

}