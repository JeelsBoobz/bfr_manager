package xyz.chz.bfm.util

// bcs yq yaml cant get emojis
// dont make this to regex
const val EXTRACTOR =
    "sed 's/\\[//g' | sed 's/\\]//g' | sed 's/\"//g' | sed 's/,//g' | sed 's/  //g' | awk 'NF'"
const val QUOTES = "sed 's/\"//g'"
const val META_REPO = "https://api.github.com/repos/JeelsBoobz/mihomo/releases/latest"
const val META_DOWNLOAD = "https://github.com/JeelsBoobz/mihomo/releases/download"
const val SING_REPO = "https://api.github.com/repos/shioeri/sing-box/releases"
const val SING_DOWNLOAD = "https://github.com/shioeri/sing-box/releases/download"