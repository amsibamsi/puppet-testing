$dir = "/tmp"

exec {
  "created":
    command => "/usr/bin/touch $dir/created",
    creates => "$dir/created",
}

file {
  "$dir/trigger":
    ensure => present,
    mode => "0644",
    notify => Exec["created"],
}
