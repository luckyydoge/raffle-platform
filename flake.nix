{
  description = "Spring Boot Development Environment";

  inputs = {
    nixpkgs.url = "github:NixOS/nixpkgs/nixos-unstable";
  };

  outputs = {
    self,
    nixpkgs,
  }: let
    system = "x86_64-linux"; # 根据你的架构修改
    pkgs = import nixpkgs {inherit system;};
  in {
    devShells.${system}.default = pkgs.mkShell {
      buildInputs = with pkgs; [
        jdk21 # 或者 jdk21
        maven
        podman-compose
      ];

      shellHook = ''
        export JAVA_HOME=${pkgs.jdk21.home}
        echo "Spring Boot Flake Shell Loaded!"
      '';
    };
  };
}
