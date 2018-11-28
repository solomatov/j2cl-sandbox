git_repository(
    name = "com_google_j2cl",
    remote = "git@github.com:google/j2cl.git",
    commit = "fea8c75601a8c49367348beac2aa4b31a490c22e"
)

git_repository(
    name = "com_google_elemental2",
    remote = "git@github.com:google/elemental2.git",
    commit = "b753b8047fabc05d95f690f50c98735d0f4b8a0a"
)

load("@com_google_j2cl//build_defs:repository.bzl", "load_j2cl_repo_deps")
load_j2cl_repo_deps()

load("@com_google_j2cl//build_defs:rules.bzl", "setup_j2cl_workspace")
setup_j2cl_workspace()