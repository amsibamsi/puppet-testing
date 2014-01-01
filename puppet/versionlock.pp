#include versionlock

  augeas {
    'versionlock':
      changes => [
        'set /files/etc/yum/pluginconf.d/versionlock.list/java-1.6.0-oracle-devel/epoch 0',
        'set /files/etc/yum/pluginconf.d/versionlock.list/java-1.6.0-oracle-devel/version 1.6.0.33-puzzle.5.el5.centos'
      ],
  }
