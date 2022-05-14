# README

Simple utility to setup a simulated environment with multiple nested websites

## Start the container

```bash
7z x nginx-1.21.6.zip
```

Open `nginx-1.21.6\conf\nginx.conf` and add

```diff
http {
    include       mime.types;
+   include       /path/to/http-security-playground/configs/*.conf;
    default_type  application/octet-stream;
```

Changing the path depending on your env.

Open `configs/parent.conf` and `configs/child.conf` and update the path to match your env.

## Ref

<https://webdock.io/en/docs/how-guides/security-guides/how-to-configure-security-headers-in-nginx-and-apache>
