git_repository(
    name = "j2cl",
    remote = "git@github.com:google/j2cl.git",
    commit = "fea8c75601a8c49367348beac2aa4b31a490c22e"
)

load("@j2cl//build_defs:repository.bzl", "load_j2cl_repo_deps")
load_j2cl_repo_deps()

load("@j2cl//build_defs:rules.bzl", "setup_j2cl_workspace")
setup_j2cl_workspace()