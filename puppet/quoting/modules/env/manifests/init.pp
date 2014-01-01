class env(
  $vars
) {

  file {
    '/tmp/env':
      content => template('env/env.erb');
  }

}
