# README

Simple utility to setup a simulated environment with multiple nested websites

## Init

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

## Run

### Nginx

```bash
# start the webserver
./nginx-start.ps1

# stop the webserver
./nginx-stop.ps1

# restart the webserver
./nginx-restart.ps1
```

### Backend

In a separate terminal where you have both `maven` and `jdk>=8`.

```bash
cd backend
./backend-start.ps1
```

## Ref

<https://webdock.io/en/docs/how-guides/security-guides/how-to-configure-security-headers-in-nginx-and-apache>
